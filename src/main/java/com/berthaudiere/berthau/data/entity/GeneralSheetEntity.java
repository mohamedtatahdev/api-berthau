package com.berthaudiere.berthau.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GeneralSheetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String name;

    @Column(name = "nbr_of_people")
    private int nbrOfPeople;

    private String goal;

   

    public GeneralSheetEntity() {
    }
    
     public GeneralSheetEntity(String name, int nbrOfPeople, String goal) {
        this.name = name;
        this.nbrOfPeople = nbrOfPeople;
        this.goal = goal;
    }

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
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
