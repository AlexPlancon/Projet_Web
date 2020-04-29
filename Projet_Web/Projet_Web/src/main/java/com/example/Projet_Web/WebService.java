package com.example.Projet_Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

@RestController
public class WebService {

    @Autowired
    LivreRepository livreRepository;
    @Autowired
    PersonRepository personRepository;

//      GET PERSON
    @GetMapping("/persons")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Person> getPersons(){
        return personRepository.findAll();
    }




    @GetMapping("/persons/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Person> getPerson(@PathVariable(value="name")String name){
        Iterable<Person> pers =  personRepository.findAllByName(name);
        return pers;
    }


//      POST LIVRE et PERSON
    @PostMapping("/livres/jeunesse")
    @ResponseStatus(HttpStatus.OK)
    public void addLivreJeu(@RequestBody Livre livre) throws Exception{
        livre.setCategorie("Jeunesse");
        livreRepository.save(livre);
    }
    @PostMapping("/livres/roman")
    @ResponseStatus(HttpStatus.OK)
    public void addLivreRom(@RequestBody Livre livre) throws Exception{
        livre.setCategorie("Roman");
        livreRepository.save(livre);
    }

    @PostMapping("/persons")
    @ResponseStatus(HttpStatus.OK)
    public void addPerson(@RequestBody Person person) throws Exception{
        personRepository.save(person);
    }

//          GET LIVRES

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/livres")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Livre> getLivres(){
        return livreRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("livres/{titre}")
    @ResponseStatus(HttpStatus.OK)
    public Livre getTitre(@PathVariable(value="titre")String titre){
        Livre liv =  livreRepository.findByTitre(titre);
        return liv;
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/livres/jeunesse")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Livre> getJeunesse(){
        Iterable<Livre> livs = livreRepository.findAll();
        Iterator<Livre> livs_it = livs.iterator();
        List<Livre> retourne = new ArrayList<Livre>();
        while(livs_it.hasNext()){
           Livre livre =  livs_it.next();
           String cat = livre.getCategorie();
           if(cat.equals("Jeunesse")){
               retourne.add(livre);
           }
        }

        return retourne;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/livres/roman")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Livre> getRoman(){
        Iterable<Livre> livs = livreRepository.findAll();
        Iterator<Livre> livs_it = livs.iterator();
        List<Livre> retourne = new ArrayList<Livre>();
        while(livs_it.hasNext()){
            Livre livre =  livs_it.next();
            String cat = livre.getCategorie();
            if(cat.equals("Roman")){
                retourne.add(livre);
            }
        }

        return retourne;
    }

//          DELETE LIVRE et PERSON
    @DeleteMapping(value="/livres/{numSerie}")
    @ResponseStatus(HttpStatus.OK)
    public void delLivre(@PathVariable(value="numSerie") String numSerie){
        livreRepository.deleteById(numSerie);
    }

    @DeleteMapping(value="/persons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delPerson(@PathVariable(value="id") long id){
        personRepository.deleteById(id);

    }
      

//      PUT Achats  localhost:8080/livres/S_Inc_Pro?id=2 exemple

    @PutMapping(value="/livres/{numSerie}")
    @ResponseStatus(HttpStatus.OK)
    public void buy(@PathVariable(value="numSerie")  String numSerie,
                    @RequestParam(value="id",required = true) long id){


        Optional<Livre> optionalLivre = livreRepository.findById(numSerie);
        Optional<Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isPresent() && optionalLivre.isPresent()){
            Livre livre = optionalLivre.get();
            Person person = optionalPerson.get();

            Buy buy1 = new Buy();

            buy1.setLivre(livre);
            buy1.setPerson(person);

            person.getAchats().add(buy1);
            livre.getAchats().add(buy1);


            livreRepository.save(livre);
            personRepository.save(person);
        }
    }

}
