package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommunicationService {
    @Autowired
    private CommunicationRepository communicationRepository;
    public List<Communication> listAllCommunication() {
        return communicationRepository.findAll();
    }

    public void saveCommunication(Communication Communication) {
    	communicationRepository.save(Communication);
    }

    public Communication getCommunication(Integer id) {
        return communicationRepository.findById(id).get();
    }

    public void deleteCommunication(Integer id) {
    	communicationRepository.deleteById(id);
    }
}

