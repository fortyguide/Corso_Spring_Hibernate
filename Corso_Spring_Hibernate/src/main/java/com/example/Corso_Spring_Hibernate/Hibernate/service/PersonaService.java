package com.example.Corso_Spring_Hibernate.Hibernate.service;

import com.example.Corso_Spring_Hibernate.Hibernate.dto.PersonaDto;
import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> getPersonaList();
    PersonaDto insertPersona(PersonaDto persona);
    Persona updatePersona(Persona persona);
    Persona deletePersona(Persona persona);
    List<Persona> findPersonaByName(String nome);
}
