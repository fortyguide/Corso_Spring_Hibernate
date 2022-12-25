package com.example.Corso_Spring_Hibernate.Hibernate.repository;

import com.example.Corso_Spring_Hibernate.Hibernate.dto.PersonaDto;
import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Classe che provvede ad interrogare il database
 * e che converte DTO in Entity
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
    public Persona insertPersona(PersonaDto persona) {
        Persona entity = new Persona(persona);
        entityManager.persist(entity);
        return entity;
    }

    @Override
    @Transactional
    public Persona updatePersona(PersonaDto persona) {
        Persona entity = new Persona(persona);
        entityManager.merge(entity);
        return entity;
    }

    @Override
    @Transactional
    public Persona deletePersona(PersonaDto persona) {
        Persona p = entityManager.find(Persona.class, persona.getId());
        entityManager.remove(p);
        Persona entity = new Persona(persona);
        return entity;
    }

    @Override
    public List<Persona> findPersonaByName(String nome) {
        Query query = entityManager.createQuery("SELECT p FROM Persona p WHERE p.nome= :nome");
        return  query.setParameter("nome", nome). getResultList();
    }
}
