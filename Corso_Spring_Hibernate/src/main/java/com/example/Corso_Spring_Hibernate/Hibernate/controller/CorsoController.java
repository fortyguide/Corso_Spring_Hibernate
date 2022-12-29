package com.example.Corso_Spring_Hibernate.Hibernate.controller;

import com.example.Corso_Spring_Hibernate.Hibernate.entity.Corso;
import com.example.Corso_Spring_Hibernate.Hibernate.service.CorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/corso")
public class CorsoController {
    @Autowired
    CorsoService corsoService;

    @GetMapping
    public ResponseEntity<List<Corso>> getListaCorsi(){
        List<Corso> listaCorsi = corsoService.getListaCorsi();
        return new ResponseEntity<List<Corso>>(listaCorsi, HttpStatus.OK);
    }
}
