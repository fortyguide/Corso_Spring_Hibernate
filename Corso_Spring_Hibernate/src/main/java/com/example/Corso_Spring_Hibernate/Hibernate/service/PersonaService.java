package com.example.Corso_Spring_Hibernate.Hibernate.service;

import com.example.Corso_Spring_Hibernate.Hibernate.dto.PersonaDto;
import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<PersonaDto> getPersonaList();
    PersonaDto insertPersona(PersonaDto persona);
    PersonaDto updatePersona(PersonaDto persona);
    PersonaDto deletePersona(PersonaDto persona);
    List<PersonaDto> findPersonaByName(String nome);
}
