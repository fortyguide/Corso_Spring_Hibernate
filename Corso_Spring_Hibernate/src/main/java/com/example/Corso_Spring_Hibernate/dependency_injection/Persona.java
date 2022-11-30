package com.example.Corso_Spring_Hibernate.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* Quando inizializziamo il progetto, Spring va a vedere tutte le classi
 * con l'annotation @Component, ne crea un bean e lo inserisce nel suo
 * cantainer
 */
@Component
public class Persona {
    public String nome;
    public String cognome;

    @Autowired
    Indirizzo indirizzo;
}
