package com.example.demo;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommunicationController {

	@Autowired
	private CommunicationRepository CommunicationRepository;
	
	@RequestMapping(value = "/communication", method = RequestMethod.GET)
	public List<Communication> get(){
		return CommunicationRepository.findAll();
	}
	
	@RequestMapping(value = "/communication/{id}", method = RequestMethod.GET)
	public ResponseEntity<Communication> GetById(@PathVariable(value = "id") long id){
		Optional<Communication> communication = CommunicationRepository.findById(id);
		if(communication.isPresent()) {
			return new ResponseEntity<Communication>(communication.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<Communication>(HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping(value = "/communication", method = RequestMethod.POST)
	public Communication Post( @RequestBody Communication communication) {
		return CommunicationRepository.save(communication);
	
	}
	
	@RequestMapping(value = "/Communication/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> Delete( @PathVariable(value="id") long id){
		Optional<Communication> communication = CommunicationRepository.findById(id);
		if(communication.isPresent()) {
			CommunicationRepository.delete(communication.get());
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
}
