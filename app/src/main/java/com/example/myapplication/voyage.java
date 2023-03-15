package com.example.myapplication;

import androidx.annotation.NonNull;

public class voyage {
    private String nom;
    private String destination;
    private String depart;
    private String JourVoyage;

    public voyage (){
        nom="";
        destination="";
        depart="";
        JourVoyage="";
    }

    public voyage (String nom,String depart, String destination, String JourVoyage){
        this.nom = nom;
        this.depart = depart;
        this.destination = destination;
        this.JourVoyage = JourVoyage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getJourVoyage() {
        return JourVoyage;
    }

    public void setJourVoyage(String jourVoyage) {
        JourVoyage = jourVoyage;
    }

    @NonNull
    @Override
    public String toString() {
        return "nom: " + nom + ", destination: " + destination + ", depart: " + depart + ", JourVoyage: " + JourVoyage;
    }
}
