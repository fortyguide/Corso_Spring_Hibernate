package com.example.Corso_Spring_Hibernate.Hibernate.dto;

import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;

/**
 * Classe DTO che deriva dall'Entity Persona, ma che nasconde
 * il campo dataInserimento della Persona all'utente finale
 */

public class PersonaDto {

    Long id;
    String nome;
    String cognome;
    Integer eta;

    public PersonaDto() {
    }

    /*Costruttore per convertire DTO in Entity*/
    public PersonaDto(Persona entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.cognome = entity.getCognome();
        this.eta = entity.getEta();
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
}
