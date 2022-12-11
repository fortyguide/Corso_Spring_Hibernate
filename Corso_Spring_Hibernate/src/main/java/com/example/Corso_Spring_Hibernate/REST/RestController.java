package com.example.Corso_Spring_Hibernate.REST;

import com.example.Corso_Spring_Hibernate.REST.entity.Animale2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @Autowired
    Service2 service;

    @GetMapping("/animali")
    public List<Animale2> getListAnimale() {
        return service.getListAnimali();
    }

    @PostMapping("/animali")
    public Animale2 inserisciAnimale(@RequestBody Animale2 animale) {
        return service.inserisciAnimale(animale);
    }

    @PutMapping("/animali")
    public Animale2 modificaAnimale(@RequestBody Animale2 animale) {
        return service.modificaAnimale(animale);
    }

    @DeleteMapping("/animali")
    public Animale2 cancellaAnimale(@RequestBody Animale2 animale) {
        return service.cancellaAnimale(animale);
    }
}
