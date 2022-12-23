package com.example.Corso_Spring_Hibernate.Hibernate.controller;

import com.example.Corso_Spring_Hibernate.Hibernate.entity.Persona;
import com.example.Corso_Spring_Hibernate.Hibernate.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Classe che espone i servizi REST
 */

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping
    public ResponseEntity<List<Persona>> getPersonaList(){
        List<Persona> listaPersone = personaService.getPersonaList();
        return new ResponseEntity<List<Persona>>(listaPersone, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Persona> insertPersona(@RequestBody Persona persona){
        Persona personaResult = personaService.insertPersona(persona);
        return new ResponseEntity<Persona>(personaResult, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona){
        Persona personaResult = personaService.updatePersona(persona);
        return new ResponseEntity<Persona>(personaResult, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Persona> deletePersona(@RequestBody Persona persona){
        Persona personaResult = personaService.deletePersona(persona);
        return new ResponseEntity<Persona>(personaResult, HttpStatus.OK);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<Persona>> getPersonaByName(@PathVariable String nome){
        List<Persona> listaPersone = personaService.findPersonaByName(nome);
        return new ResponseEntity<List<Persona>>(listaPersone, HttpStatus.OK);
    }
}
