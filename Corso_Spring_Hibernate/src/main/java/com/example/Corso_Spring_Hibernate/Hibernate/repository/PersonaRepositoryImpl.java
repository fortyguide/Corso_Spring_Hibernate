package com.example.Corso_Spring_Hibernate.Hibernate.repository;

import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Classe che provvede ad interrogare il database
 */

@Repository
public class PersonaRepositoryImpl implements PersonaRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Persona> getPersonaList() {
        Query query = entityManager.createQuery("SELECT p FROM Persona p");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Persona insertPersona(Persona persona) {
        entityManager.persist(persona);
        return persona;
    }

    @Override
    @Transactional
    public Persona updatePersona(Persona persona) {
        entityManager.merge(persona);
        return persona;
    }

    @Override
    @Transactional
    public Persona deletePersona(Persona persona) {
        Persona p = entityManager.find(Persona.class, persona.getId());
        entityManager.remove(p);
        return p;
    }

    @Override
    public List<Persona> findPersonaByName(String nome) {
        Query query = entityManager.createQuery("SELECT p FROM Persona p WHERE p.nome= :nome");
        return  query.setParameter("nome", nome). getResultList();
    }
}
