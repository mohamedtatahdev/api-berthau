package com.berthaudiere.berthau.web.sheet;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public abstract class GeneralSheet {
    private Integer id;

    @NotBlank(message = "Le nom ne doit pas être vide")
    private String name;

    @Min(value = 1, message = "Il faut au moins une personne")
    private int nbrOfPeople;

    @NotBlank(message = "L'objectif ne doit pas être vide")
    private String goal;
    
     public GeneralSheet() {
    }
    
    public GeneralSheet(String name, int nbrOfPeople, String goal) {
        this.name = name;
        this.nbrOfPeople = nbrOfPeople;
        this.goal = goal;
    }

    public GeneralSheet(Integer id, String name, int nbrOfPeople, String goal) {
        this.id = id;
        this.name = name;
        this.nbrOfPeople = nbrOfPeople;
        this.goal = goal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbrOfPeople() {
        return nbrOfPeople;
    }

    public void setNbrOfPeople(int nbrOfPeople) {
        this.nbrOfPeople = nbrOfPeople;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    

   
    
}


