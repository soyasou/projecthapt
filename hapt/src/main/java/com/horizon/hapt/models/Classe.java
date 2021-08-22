package com.horizon.hapt.models;

public class Classe {
    private Long id;
    private String nom;

    public Classe(Long id, String nom) {
        this.setId(id);
        this.setNom(nom);
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

}
