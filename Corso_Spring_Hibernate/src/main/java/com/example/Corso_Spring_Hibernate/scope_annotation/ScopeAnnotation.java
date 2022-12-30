package com.example.Corso_Spring_Hibernate.scope_annotation;

import com.example.Corso_Spring_Hibernate.dependency_injection.Persona1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/scope")
public class ScopeAnnotation {

    /* L'annotation @Autowired va sopra la dichiarazione
     * dell'istanza di una classe annotata precedentemente
     * con l'annotation @Component (vale anche per classi
     * annotate con @Controller(@RestController), @Service,
     * o @Repository). In questo modo non abbiamo bisogno
     * di inizializzare l'istanza con new,
     * dato che lo fa già Spring dietro le quinte */
    @Autowired
    Persona1 p;

    @Autowired
    Persona1 p2;

    @Autowired
    Persona1 p3;

    @RequestMapping("/stampa")
    public void stampa(){
        System.out.println("numero istanze di Persona : " + Persona1.contatore);
    }
}
