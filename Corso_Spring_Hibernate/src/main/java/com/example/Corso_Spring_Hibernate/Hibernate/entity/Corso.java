package com.example.Corso_Spring_Hibernate.Hibernate.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
/*L'annotazione @JsonIdentityInfo è da aggiungere su tutte le entity coinvolte
* in una relazione @ManyToMany. In caso di mancato inserimento, si hanno errori
* inaspettati nel caso di esecuzione dei metodi di tipo GET.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Corso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_corso")
    Long id;
    String nome;
    Integer numeroIscritti;

    /* L'annotazione @ManyToMany serve per identificare una relazione
     * molti a molti tra le tabelle Corso e Persona.
     * Quando si usa il @ManyToMany tra due tabelle si deve specificare
     * da entrambe le parti la tabella di join, tramite l'annotation @JoinTable. */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "persone_corsi",
            joinColumns = @JoinColumn(name = "id_corso"),
            inverseJoinColumns = @JoinColumn(name = "id_persona")
    )
    Set<Persona> listaPersone;

    public Corso() {
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

    public Integer getNumeroIscritti() {
        return numeroIscritti;
    }

    public void setNumeroIscritti(Integer numeroIscritti) {
        this.numeroIscritti = numeroIscritti;
    }

    public Set<Persona> getListaPersone() {
        return listaPersone;
    }

    public void setListaPersone(Set<Persona> listaPersone) {
        this.listaPersone = listaPersone;
    }
}
