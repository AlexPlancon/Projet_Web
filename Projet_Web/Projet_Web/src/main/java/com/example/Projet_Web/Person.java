package com.example.Projet_Web;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Person {

    private long id;
    private String name;
    private int age;
    private Collection<Buy> achats = new ArrayList<Buy>();

    public Person(){
        super();
    }
    public Person(String name,int age){
        super();
        this.name =name;
        this.age = age;
    }
    public Person(String name){
        super();
        this.name =name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId(){
        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "person")
    @JsonIgnore
    public Collection<Buy> getAchats(){
        return achats;
    }

    public void setAchats(Collection<Buy> achats) {
        this.achats = achats;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
