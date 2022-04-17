package com.example.dvdrental.repository;

import com.example.dvdrental.model.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends CrudRepository<Actor,Integer> {
    List<Actor> findAll();
    List<Actor> findByFirstName(String name);
}
