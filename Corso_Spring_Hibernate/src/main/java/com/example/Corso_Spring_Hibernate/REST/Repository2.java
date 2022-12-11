package com.example.Corso_Spring_Hibernate.REST;

import com.example.Corso_Spring_Hibernate.REST.entity.Animale2;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository2 {

    public List<Animale2> getListAnimali(){
        List<Animale2> listaAnimali= new ArrayList<>();
        Animale2 animale = new Animale2();
        animale.setClassificazione("Mammifero");
        animale.setRazza("Cane");
        listaAnimali.add(animale);

        return listaAnimali;
    }

    public Animale2 inserisciAnimale(Animale2 animale) {
        return animale;
    }

    public Animale2 modificaAnimale(Animale2 animale) {
        return animale;
    }

    public Animale2 cancellaAnimale(Animale2 animale) {
        return animale;
    }
}
