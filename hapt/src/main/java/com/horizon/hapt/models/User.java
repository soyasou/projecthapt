package com.horizon.hapt.models;

import java.util.Date;
import java.util.List;

public class User {
    private Long id;
    private String mail;
    private String password;
    private String nom;
    private String prenom;
    private String adresse;
    private int cin;
    private int tel;
    private String niveau;
    private Date dateN;
    private List<Role> listeRole;
    private List<Etudiant> listeEtudiant;
    private List<Entreprise> listeEntreprise;

    public User(Long id, String mail, String password, String nom, String prenom, int cin, int tel, String niveau,
            Date dateN) {
        this.setId(id);
        this.setMail(mail);
        this.password = password;

    }

    public List<Entreprise> getListeEntreprise() {
        return listeEntreprise;
    }

    public void setListeEntreprise(List<Entreprise> listeEntreprise) {
        this.listeEntreprise = listeEntreprise;
    }

    public List<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

    public void setListeEtudiant(List<Etudiant> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }

    public List<Role> getListeRole() {
        return listeRole;
    }

    public void setListeRole(List<Role> listeRole) {
        this.listeRole = listeRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
