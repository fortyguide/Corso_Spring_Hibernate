package com.example.Corso_Spring_Hibernate.Hibernate.repository;

import com.example.Corso_Spring_Hibernate.Hibernate.dto.PersonaDto;
import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;

import java.util.List;

public interface PersonaRepository {

    List<Persona> getPersonaList();
    Persona insertPersona(PersonaDto persona);
    Persona updatePersona(Persona persona);
    Persona deletePersona(Persona persona);
    List<Persona> findPersonaByName(String nome);
}
