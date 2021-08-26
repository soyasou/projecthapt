package com.horizon.hapt.models;

public class Entreprise {
    private Long id;
    private String raison;
    private String matreculeFiscale;
    private String rc;

    public Entreprise(Long id, String raison, String matreculeFiscale, String rc) {
        this.setId(id);
        this.setRaisonSociale(raison);
        this.setMatreculeFiscale(matreculeFiscale);
        this.setRegistreCommercial(rc);
    }

    public String getMatreculeFiscale() {
        return matreculeFiscale;
    }

    public void setMatreculeFiscale(String matreculeFiscale) {
        this.matreculeFiscale = matreculeFiscale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaisonSociale(String raison) {
        this.raison = raison;
    }

    public String getrc() {
        return rc;
    }

    public void setRegistreCommercial(String rc) {
        this.rc = rc;
    }

}
