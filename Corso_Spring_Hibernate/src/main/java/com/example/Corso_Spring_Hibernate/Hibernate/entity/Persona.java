package com.example.Corso_Spring_Hibernate.Hibernate.entity;

import com.example.Corso_Spring_Hibernate.Hibernate.dto.PersonaDto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Questa classe rappresenta la copia di una tabella sul database.
 * La sua struttura rappresenterà un record di tale tabella.
 * N.B.: Quando si lavora con oggetti che mappano tabelle, è
 * opportuno lavorare con le classi Wrapper, quindi non con i primitivi.
 */
@Entity
/*L'annotazione @JsonIdentityInfo è da aggiungere su tutte le entity coinvolte
 * in una relazione @ManyToMany. In caso di mancato inserimento, si hanno errori
 * inaspettati nel caso di esecuzione dei metodi di tipo GET.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Persona implements Serializable {

    @Serial
    private static final long serialVersionUID = 4020265201492587343L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_persona")
    Long id;
    String nome;
    String cognome;
    Integer eta;
    @CreationTimestamp
    Timestamp dataInserimento;

    /*L'annotazione @OneToOne serve per identificare una relazione
     * uno a uno tra le tabelle Persona e Tessera.
     * Valorizzare l'annotation con cascade = CascadeType.ALL serve per
     * propagare un azione di tipo POST, DELETE o PUT dalla tabella padre
     * (in questo caso Persona) anche alle tabelle figlie (Tessera e Trainer).
     * L'annotazione @JoinColumn serve per creare la colonna per
     * il join tra tabelle */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    Tessera tesseraIscrizione;

    /* L'annotazione @ManyToOne serve per identificare una relazione
    * molti a uno tra le tabelle Persona e Trainer.
    * Valorizzare l'annotation con cascade = CascadeType.ALL serve per
    * propagare un azione di tipo POST, DELETE o PUT dalla tabella padre
    * (in questo caso Persona) anche alle tabelle figlie */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_trainer")
    Trainer trainer;

    /* L'annotazione @ManyToMany serve per identificare una relazione
    * molti a molti tra le tabelle Persona e Corso.
    * Quando si usa il @ManyToMany tra due tabelle si deve specificare
    * da entrambe le parti la tabella di join, tramite l'annotation @JoinTable. */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "persone_corsi",
            joinColumns = @JoinColumn(name = "id_persona"),
            inverseJoinColumns = @JoinColumn(name = "id_corso")
    )
    Set<Corso> listaCorsi;

    public Persona() {
    }

    /*Costruttore per convertire Entity in DTO*/
    public Persona(PersonaDto dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.cognome = dto.getCognome();
        this.eta = dto.getEta();
        this.tesseraIscrizione = new Tessera();
        tesseraIscrizione.setAttivita(dto.getTesseraIscrizione().getAttivita());
        tesseraIscrizione.setPromozione(dto.getTesseraIscrizione().getPromozione());
        this.trainer = new Trainer();
        trainer.setId(dto.getTrainer().getId());
        trainer.setNome(dto.getTrainer().getNome());
        trainer.setCognome(dto.getTrainer().getCognome());
        this.listaCorsi = new HashSet<>();
        this.listaCorsi = dto.getListaCorsi();
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
