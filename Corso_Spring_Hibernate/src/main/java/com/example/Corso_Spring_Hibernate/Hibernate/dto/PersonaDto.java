package com.example.Corso_Spring_Hibernate.Hibernate.dto;

import com.example.Corso_Spring_Hibernate.Hibernate.entity.Corso;
import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;
import com.example.Corso_Spring_Hibernate.Hibernate.entity.Tessera;
import com.example.Corso_Spring_Hibernate.Hibernate.entity.Trainer;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe DTO che deriva dall'Entity Persona, ma che nasconde
 * il campo dataInserimento della Persona all'utente finale
 */

public class PersonaDto {

    Long id;
    String nome;
    String cognome;
    Integer eta;
    Tessera tesseraIscrizione;
    Trainer trainer;
    Set<Corso> listaCorsi;

    public PersonaDto() {
    }

    /*Costruttore per convertire DTO in Entity*/
    public PersonaDto(Persona entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.cognome = entity.getCognome();
        this.eta = entity.getEta();
        this.tesseraIscrizione = new Tessera();
        tesseraIscrizione.setAttivita(entity.getTesseraIscrizione().getAttivita());
        tesseraIscrizione.setPromozione(entity.getTesseraIscrizione().getPromozione());
        this.trainer = new Trainer();
        trainer.setId(entity.getTrainer().getId());
        trainer.setNome(entity.getTrainer().getNome());
        trainer.setCognome(entity.getTrainer().getCognome());
        this.listaCorsi = new HashSet<>();
        this.listaCorsi = entity.getListaCorsi();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public Tessera getTesseraIscrizione() {
        return tesseraIscrizione;
    }

    public void setTesseraIscrizione(Tessera tesseraIscrizione) {
        this.tesseraIscrizione = tesseraIscrizione;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Set<Corso> getListaCorsi() {
        return listaCorsi;
    }

    public void setListaCorsi(Set<Corso> listaCorsi) {
        this.listaCorsi = listaCorsi;
    }
}
