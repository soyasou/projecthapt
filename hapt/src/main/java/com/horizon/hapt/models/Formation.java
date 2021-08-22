package com.horizon.hapt.models;

import java.util.Date;

public class Formation {
    private Long id;
    private String nom;
    private Date dateD;
    private Date dateF;
    private String duree;
    private String programme;
    private String certification;

    public Formation(Long id, String nom, Date dateD, Date dateF, String duree, String programme,
            String certification) {
        this.setNom(nom);
        this.setDateD(dateD);
        this.setDateF(dateF);
        this.setDuree(duree);
        this.setProgramme(programme);
        this.setCertification(certification);
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

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

}
