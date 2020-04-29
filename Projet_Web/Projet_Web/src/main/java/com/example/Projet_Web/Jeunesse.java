package com.example.Projet_Web;

import javax.persistence.Entity;

@Entity
public class Jeunesse extends Livre {


    public Jeunesse (){

    }
    public Jeunesse(String numSerie,String titre,String auteur,int prix,String description){
        super(numSerie,titre,auteur,prix,description);
        setCategorie("Jeunesse");
    }


}
