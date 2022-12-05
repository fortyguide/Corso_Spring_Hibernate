package com.example.Corso_Spring_Hibernate.pathvariable_annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pathvariable")
public class PathVariableAnnotation {

    @RequestMapping("/stampa/{variabile}")
    public void stampa(@PathVariable int variabile){
        if(variabile < 0){
            System.out.println("il valore della variabile è negativo");
        } else {
            System.out.println("il valore della variabile è positivo");
        }
    }
}
