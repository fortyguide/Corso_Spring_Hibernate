package com.example.Corso_Spring_Hibernate.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/* @Scoope("prototype") permette di creare un'istanza della classe ogni
 * qualvolta si farà l'@Autowired. Senza @Scope, o con @Scope("singleton"),
 * l'@Autowired chiama sempre la stessa istanza (singleton pattern)*/
@Scope("singleton")

/* Quando inizializziamo il progetto, Spring va a vedere tutte le classi
 * con l'annotation @Component, ne crea un bean e lo inserisce nel suo cantainer*/
@Component
public class Persona {
    public String nome;
    public String cognome;
    public static int contatore = 0;

    @Autowired
    Indirizzo indirizzo;

    public Persona() {
        contatore ++;
    }
}
