package com.horizon.hapt.models;

public class Etudiant {
    private Long id;
    private int contactF;

    public Etudiant(Long id, int contactF) {
        this.setId(id);
        this.setContactF(contactF);
    }

    public int getContactF() {
        return contactF;
    }

    public void setContactF(int contactF) {
        this.contactF = contactF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}