package com.example.Corso_Spring_Hibernate.Hibernate.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

/**
 * Questa classe rappresenta la copia di una tabella sul database.
 * La sua struttura rappresenterà un record di tale tabella.
 * N.B.: Quando si lavora con oggetti che mappano tabelle, è
 * opportuno lavorare con le classi Wrapper, quindi non con i primitivi.
 */
@Entity
public class Trainer implements Serializable {

    @Serial
    private static final long serialVersionUID = 2565211992648641386L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /* L'annotation @Column serve per cambiare il nome di una colonna
    * nel caso in cui nelle relazioni tra più tabelle ci siano colonne
    * con lo stesso nome */
    @Column(name = "id_trainer")
    Long id;
    String nome;
    String cognome;

    /* L'annotazione @OneToMany serve per identificare una relazione
     * uno a molti tra le tabelle Trainer e Persona. */
    @OneToMany(mappedBy = "trainer")
    Set<Persona> listaAllievi;

    public Trainer() {
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

    public Set<Persona> getListaAllievi() {
        return listaAllievi;
    }

    public void setListaAllievi(Set<Persona> listaAllievi) {
        this.listaAllievi = listaAllievi;
    }
}
