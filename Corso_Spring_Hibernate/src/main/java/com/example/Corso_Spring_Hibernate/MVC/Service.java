package com.example.Corso_Spring_Hibernate.MVC;

import com.example.Corso_Spring_Hibernate.MVC.entity.Animale;
import org.springframework.beans.factory.annotation.Autowired;

/*La classe annotata con @Service deve restituire il risultato
* del metodo che abbiamo all'interno della classe annotata con @Repository*/
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;

    public Animale getAnimaleService(){
        return repository.getAnimaleRepository();
    }
}
