package com.example.Corso_Spring_Hibernate.Hibernate.entity;

import com.example.Corso_Spring_Hibernate.Hibernate.dto.PersonaDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

/**
 * Questa classe rappresenta la copia di una tabella su un database.
 * La sua struttura rappresenterà un record di tale tabella.
 * N.B.: Quando si lavora con oggetti che mappano tabelle, è
 * opportuno lavorare con le classi Wrapper, quindi non con i primitivi.
 */

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nome;
    String cognome;
    Integer eta;
    @CreationTimestamp
    Timestamp dataInserimento;

    public Persona() {
    }

    /*Costruttore per convertire Entity in DTO*/
    public Persona(PersonaDto dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.cognome = dto.getCognome();
        this.eta = dto.getEta();
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

    public Timestamp getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(Timestamp dataInserimento) {
        this.dataInserimento = dataInserimento;
    }
}
