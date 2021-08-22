package com.horizon.hapt.models;

public class Entreprise {
    private String raisonSociale;
    private int matreculeFiscale;
    private int tel;
    private String registreCommercial;

    public Entreprise(String raisonSociale, int matreculeFiscale, int tel, String registreCommercial) {
        this.setRaisonSociale(raisonSociale);
        this.setMatreculeFiscale(matreculeFiscale);
        this.setTel(tel);
        this.setRegistreCommercial(registreCommercial);
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public int getMatreculeFiscale() {
        return matreculeFiscale;
    }

    public void setMatreculeFiscale(int matreculeFiscale) {
        this.matreculeFiscale = matreculeFiscale;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getRegistreCommercial() {
        return registreCommercial;
    }

    public void setRegistreCommercial(String registreCommercial) {
        this.registreCommercial = registreCommercial;
    }

}
