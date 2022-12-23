package com.example.Corso_Spring_Hibernate;

import com.example.Corso_Spring_Hibernate.dependency_injection.Persona1;
import com.example.Corso_Spring_Hibernate.dependency_injection.Veicolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class CorsoSpringHibernateApplication {

	/*In questo caso, invece, l'annotation @Autowired sta
	* sopra la dichiarazione dell'istanza di una classe
	* che è stata configurata mediante un metodo @Bean
	* all'interno di una classe annotata con @Configuration */
	@Autowired
	@Qualifier("1")
	Veicolo v;

	@Autowired
	@Qualifier("2")
	Veicolo v2;

	public static void main(String[] args) {
		SpringApplication.run(CorsoSpringHibernateApplication.class, args);
	}

	@RequestMapping("/")
	public void stampaVeicolo(){
		System.out.println("\nnome marca veicolo 1 = " + v.getNomeMarca() + "\n" +
				           "nome modello veicolo 1 = " + v.getNomeModello() + "\n");

		System.out.println("nome marca veicolo 2 = " + v2.getNomeMarca() + "\n" +
				           "nome modello veicolo 2 = " + v2.getNomeModello() + "\n");
	}
}
