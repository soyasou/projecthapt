package com.horizon.hapt.models;

public class Admin {
    private String nom;
    private String prenom;
    private int tel;

    public Admin(String nom, String prenom, int tel) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTel(tel);
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

}
