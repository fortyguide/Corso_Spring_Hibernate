package com.example.Corso_Spring_Hibernate.requestparam_annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/requestparam")
public class RequestParamAnnotation {

        @RequestMapping("/stampa")
        public void stampa(@RequestParam int variabile) {
        if (variabile < 0) {
            System.out.println("il valore della variabile è negativo");
        } else {
            System.out.println("il valore della variabile è positivo");
        }
    }
}
