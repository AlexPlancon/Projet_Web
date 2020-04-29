package com.example.Projet_Web;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LivreRepository extends CrudRepository<Livre,String> {
    Livre findByTitre(String titre);
    List<Livre> findAllByTitre(String titre);



}
