package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommunicationController {
    @Autowired
    CommunicationService communicationService;

    @GetMapping("")
    public List<Communication> list() {
        return communicationService.listAllCommunication();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Communication> get(@PathVariable Integer id) {
        try {
        	Communication communication = communicationService.getCommunication(id);
            return new ResponseEntity<Communication>(communication, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Communication>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Communication communication) {
    	communicationService.saveCommunication(communication);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Communication communication, @PathVariable Integer id) {
        try {
        	Communication existCommunication = communicationService.getCommunication(id);
        	communication.setId(id);            
            communicationService.saveCommunication(communication);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

    	communicationService.deleteCommunication(id);
    }
}
