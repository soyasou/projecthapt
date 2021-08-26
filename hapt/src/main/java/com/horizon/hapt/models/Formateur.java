package com.horizon.hapt.models;

public class Formateur {
    private String nom;
    private String prenom;
    private int tel;
    private String adresse;

    public Formateur(String nom, String prenom, int tel, String adresse) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTel(tel);
        this.setAdress(adresse);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAdress() {
        return adresse;
    }

    public void setAdress(String adresse) {
        this.adresse = adresse;
    }

}
