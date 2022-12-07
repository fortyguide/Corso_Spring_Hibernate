package com.example.Corso_Spring_Hibernate.MVC;

import com.example.Corso_Spring_Hibernate.MVC.entity.Animale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/*La classe annotata con @Controller deve restituire il risultato
 * del metodo che abbiamo all'interno della classe annotata con @Service*/
@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @Autowired
    Service service;

    @RequestMapping("/animale")
    public Animale getAnimale() {

        Animale animale = service.getAnimaleService();
        System.out.println("\nClassificazione = " + animale.getClassificazione());
        System.out.println("Razza = " + animale.getRazza() + "\n");

        return service.getAnimaleService();
    }
}
