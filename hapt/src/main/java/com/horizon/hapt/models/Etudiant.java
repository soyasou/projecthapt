package com.horizon.hapt.models;

import java.util.Date;

public class Etudiant {
    private String nom;
    private String prenom;
    private String adresse;
    private int cin;
    private int tel;
    private String niveau;
    private int contact;
    private Date dateN;

    public Etudiant(String nom, String prenom, String adresse, int cin, int tel, String niveau, int contact,
            Date dateN) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.setCin(cin);
        this.setTel(tel);
        this.setNiveau(niveau);
        this.setContact(contact);
        this.setDateN(dateN);

    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
