package com.example.dvdrental.controller;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.dvdrental.model.Actor;
import com.example.dvdrental.service.ActorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActorResolver implements GraphQLQueryResolver {

    @Autowired
    private ActorService actorService;

    public List<Actor> allActors() {
        return actorService.findAllActor();
    }
}
