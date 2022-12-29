package com.example.Corso_Spring_Hibernate.Hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

/**
 * Questa classe rappresenta la copia di una tabella sul database.
 * La sua struttura rappresenterà un record di tale tabella.
 * N.B.: Quando si lavora con oggetti che mappano tabelle, è
 * opportuno lavorare con le classi Wrapper, quindi non con i primitivi.
 */
@Entity
public class Tessera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String attivita;
    String promozione;

    public Tessera() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttivita() {
        return attivita;
    }

    public void setAttivita(String attivita) {
        this.attivita = attivita;
    }

    public String getPromozione() {
        return promozione;
    }

    public void setPromozione(String promozione) {
        this.promozione = promozione;
    }
}
