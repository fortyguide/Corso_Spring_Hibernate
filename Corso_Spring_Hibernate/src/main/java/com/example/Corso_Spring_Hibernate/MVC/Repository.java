package com.example.Corso_Spring_Hibernate.MVC;

import com.example.Corso_Spring_Hibernate.MVC.entity.Animale;

/* Normalmente nella classe annotata con @Repository, ci troviamo all'interno
* del Data Access Layer di un'applicazione web, dove di usano tecnologie
* (come Hibernate) per fare le query al database. Per questa volta però
* facciamo una finta chiamata ad un database ideale, giusto per capire il
* concetto che riguarda il design pattern MVC*/
@org.springframework.stereotype.Repository
public class Repository {


    public Animale getAnimaleRepository(){
        Animale animale = new Animale();
        animale.setClassificazione("Mammifero");
        animale.setRazza("Cane");

        return animale;
    }
}
