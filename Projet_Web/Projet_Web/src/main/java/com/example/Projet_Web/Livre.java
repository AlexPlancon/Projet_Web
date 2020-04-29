package com.example.Projet_Web;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Livre {
    private String numSerie;
    private String titre;
    private String auteur;
    private int prix;
    private String description;
    private String categorie;

    private Collection<Buy> achats;

    public Livre(){

    }
    public Livre(String numSerie,String titre,String auteur,int prix,String description){
        this.numSerie = numSerie;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.description = description;
        this.categorie = "Pas de catégorie";
    }

    @Id
    public String getNumSerie(){

        return numSerie;
    }

    public void setNumSerie(String numSerie) {

        this.numSerie = numSerie;
    }

    @OneToMany(mappedBy = "livre")
    @JsonIgnore
    public Collection<Buy> getAchats(){
        return achats;
    }

    public void setAchats(Collection<Buy> achats) {
        this.achats = achats;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }
}

