package com.example.Corso_Spring_Hibernate.Hibernate.service;

import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;
import com.example.Corso_Spring_Hibernate.Hibernate.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonaList() {
        return personaRepository.getPersonaList();
    }

    @Override
    public Persona insertPersona(Persona persona) {
        return personaRepository.insertPersona(persona);
    }

    @Override
    public Persona updatePersona(Persona persona) {
        return personaRepository.updatePersona(persona);
    }

    @Override
    public Persona deletePersona(Persona persona) {
        return personaRepository.deletePersona(persona);
    }

    @Override
    public List<Persona> findPersonaByName(String nome) {
        return personaRepository.findPersonaByName(nome);
    }
}
