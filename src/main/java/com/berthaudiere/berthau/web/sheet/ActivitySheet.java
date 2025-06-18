package com.berthaudiere.berthau.web.sheet;

import jakarta.validation.constraints.NotBlank;

public class ActivitySheet extends GeneralSheet {
    @NotBlank(message = "L'objectif ne doit pas être vide")
    private String purpose;

    @NotBlank(message = "Le materiel ne doit pas être vide")
    private String material;
    
    public ActivitySheet() {
    super();
}

    public ActivitySheet(Integer id, String name, int nbrOfPeople, String goal, String purpose, String material) {
        super(id, name, nbrOfPeople, goal);
        this.purpose = purpose;
        this.material = material;
    }



    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
