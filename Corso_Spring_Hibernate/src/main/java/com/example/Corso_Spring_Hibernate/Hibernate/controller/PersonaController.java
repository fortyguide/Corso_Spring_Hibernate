package com.example.Corso_Spring_Hibernate.Hibernate.controller;

import com.example.Corso_Spring_Hibernate.Hibernate.dto.PersonaDto;
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
    public ResponseEntity<List<PersonaDto>> getPersonaList(){
        List<PersonaDto> listaPersone = personaService.getPersonaList();
        return new ResponseEntity<List<PersonaDto>>(listaPersone, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PersonaDto> insertPersona(@RequestBody PersonaDto persona){
        PersonaDto personaResult = personaService.insertPersona(persona);
        return new ResponseEntity<PersonaDto>(personaResult, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PersonaDto> updatePersona(@RequestBody PersonaDto persona){
        PersonaDto personaResult = personaService.updatePersona(persona);
        return new ResponseEntity<PersonaDto>(personaResult, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<PersonaDto> deletePersona(@RequestBody PersonaDto persona){
        PersonaDto personaResult = personaService.deletePersona(persona);
        return new ResponseEntity<PersonaDto>(personaResult, HttpStatus.OK);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<PersonaDto>> getPersonaByName(@PathVariable String nome){
        List<PersonaDto> listaPersone = personaService.findPersonaByName(nome);
        return new ResponseEntity<List<PersonaDto>>(listaPersone, HttpStatus.OK);
    }
}
