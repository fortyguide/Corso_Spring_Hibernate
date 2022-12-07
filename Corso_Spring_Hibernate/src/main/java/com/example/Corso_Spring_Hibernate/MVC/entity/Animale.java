package com.example.Corso_Spring_Hibernate.MVC.entity;

public class Animale {
    String classificazione;
    String razza;

    public Animale() {
    }

    public String getClassificazione() {
        return classificazione;
    }

    public void setClassificazione(String classificazione) {
        this.classificazione = classificazione;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }
}
