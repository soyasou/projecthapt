package com.horizon.hapt.models;

public class Formateur {
    private String nom;
    private String prenom;
    private int tel;
    private String adress;

    public Formateur(String nom, String prenom, int tel, String adress) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTel(tel);
        this.setAdress(adress);
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
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
