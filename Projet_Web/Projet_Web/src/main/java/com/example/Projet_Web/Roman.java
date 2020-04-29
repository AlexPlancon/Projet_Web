package com.example.Projet_Web;

import javax.persistence.Entity;

@Entity
public class Roman extends Livre {


    public Roman(){

    }
    public Roman(String numSerie,String titre,String auteur,int prix,String description){
        super(numSerie,titre,auteur,prix,description);
        setCategorie("Roman");
    }


}
