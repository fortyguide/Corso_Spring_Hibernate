package com.example.Corso_Spring_Hibernate.Hibernate.repository;

import com.example.Corso_Spring_Hibernate.Hibernate.entity.Corso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CorsoRepositoryImpl implements CorsoRepository{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Corso> getListaCorsi() {
        Query query = entityManager.createQuery("SELECT c FROM Corso c");
        return query.getResultList();
    }
}
