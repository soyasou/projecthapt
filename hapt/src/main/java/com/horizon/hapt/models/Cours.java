package com.horizon.hapt.models;

public class Cours {
    private Long id;
    private String nom;
    private String documentation;

    public Cours(Long id, String nom, String documentation) {
        this.setId(id);
        this.setNom(nom);
        this.setDocumentation(documentation);
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

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

}
