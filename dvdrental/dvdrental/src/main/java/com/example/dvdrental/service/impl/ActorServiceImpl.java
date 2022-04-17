package com.example.dvdrental.service.impl;

import com.example.dvdrental.model.Actor;
import com.example.dvdrental.repository.ActorRepository;
import com.example.dvdrental.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    ActorRepository actorRepository;

    @Override
    public List<Actor> findAllActor() {
        return actorRepository.findAll();
    }
}
