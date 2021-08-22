package com.horizon.hapt.models;

public class Role {
    private Long id;
    private String nom;

    public Role(long id, String nom) {
        this.setId(id);
        this.setNom(nom);

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
