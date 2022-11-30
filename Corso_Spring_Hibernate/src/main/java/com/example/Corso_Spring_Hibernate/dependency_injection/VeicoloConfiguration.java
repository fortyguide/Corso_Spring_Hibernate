package com.example.Corso_Spring_Hibernate.dependency_injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VeicoloConfiguration {

    /*All'interno di una classe di configurazione (annotata con @Configuration)
      si devono creare uno, o più metodi, annotati con @Bean che generano delle classi.
      All'interno del metodo, o dei metodi, si configura la classe che devono restituire*/
    @Bean
    @Qualifier("1")
    public Veicolo configuraVeicolo(){
        Veicolo veicolo = new Veicolo();
        veicolo.setNomeMarca("Citroen");
        veicolo.setNomeModello("C1");
        return veicolo;
    }

    @Bean
    @Qualifier("2")
    public Veicolo configuraVeicolo2(){
        Veicolo veicolo = new Veicolo();
        veicolo.setNomeMarca("Fiat");
        veicolo.setNomeModello("Panda");
        return veicolo;
    }
}
