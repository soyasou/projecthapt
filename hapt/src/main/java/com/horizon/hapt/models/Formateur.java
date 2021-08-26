package com.horizon.hapt.models;

public class Formateur {
    private Long id;
    private int experience;

    public Formateur(Long id, int experience) {
        this.setId(id);
        this.setExperience(experience);

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
