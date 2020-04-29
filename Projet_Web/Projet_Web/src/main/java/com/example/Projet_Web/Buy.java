package com.example.Projet_Web;

import javax.persistence.*;

@Entity
public class Buy {

    private long numeroAchat;
    private Person person;
    private Livre livre;

    public Buy(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getNumeroAchat(){
        return numeroAchat;
    }

    public void setNumeroAchat(long numeroAchat) {
        this.numeroAchat = numeroAchat;
    }

    @ManyToOne
    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne
    public Livre getLivre(){
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

}
