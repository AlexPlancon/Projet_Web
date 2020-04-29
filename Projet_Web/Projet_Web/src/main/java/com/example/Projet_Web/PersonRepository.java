package com.example.Projet_Web;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Long> {
    Person findByName(String name);
    List<Person> findAllByName(String name);
}
