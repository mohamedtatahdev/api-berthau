package com.berthaudiere.berthau.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "activity_sheet")
public class ActivitySheetEntity extends GeneralSheetEntity {

    private String purpose;

    private String material;

    public ActivitySheetEntity() {
    }

    public ActivitySheetEntity(String name, int nbrOfPeople, String goal, String purpose, String material) {
        super(name, nbrOfPeople, goal);
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
