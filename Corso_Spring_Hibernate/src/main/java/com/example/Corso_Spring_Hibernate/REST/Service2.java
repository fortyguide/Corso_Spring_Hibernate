package com.example.Corso_Spring_Hibernate.REST;

import com.example.Corso_Spring_Hibernate.REST.entity.Animale2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Service
public class Service2 {

    @Autowired
    Repository2 repository;

    public List<Animale2> getListAnimali() {
        return repository.getListAnimali();
    }

    public Animale2 inserisciAnimale(Animale2 animale) {
        return repository.inserisciAnimale(animale);
    }

    public Animale2 modificaAnimale(Animale2 animale) {
        return repository.modificaAnimale(animale);
    }

    public Animale2 cancellaAnimale(Animale2 animale) {
        return repository.cancellaAnimale(animale);
    }
}
