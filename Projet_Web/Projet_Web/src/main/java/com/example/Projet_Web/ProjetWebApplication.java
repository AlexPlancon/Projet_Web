package com.example.Projet_Web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjetWebApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ProjetWebApplication.class, args);

		PersonRepository personRepository =(PersonRepository) context.getBean("personRepository");
		LivreRepository livreRepository = (LivreRepository) context.getBean("livreRepository");

		Person per1 = new Person("Alexandra",20);
		Person perbis = new Person("Alexandra",12);
		Person per2 = new Person("Annie");
		Person per3 = new Person("Patrick",54);

		personRepository.save(per1);
		personRepository.save(perbis);
		personRepository.save(per2);
		personRepository.save(per3);

		Livre liv1 = new Roman("Jeu_PM_Eux","Eux-meme","Pierre LeMaitre",18,"Ce livre raconte la vie d'une jeune femme.");
		Livre liv2 = new Jeunesse("Rom_Dis_Belle","La belle et la bete","Disney",12,"Ce conte raconte la rencontre inimaginable entre deux êtres.");
		Livre liv3 = new Livre("S_Inc_Pro","La Promesse","Inconnu",10,"Une nouvelle très intense.");
		Livre liv4 = new Jeunesse("Jeu_Inc_Tchou","Tchoupi et doudou","Inconnu",10,"Pour les tout petit.");



		livreRepository.save(liv4);
		livreRepository.save(liv1);
		livreRepository.save(liv2);
		livreRepository.save(liv3);
	}

}
