package com.berthaudiere.berthau.web.dto;

import com.berthaudiere.berthau.data.entity.ActivitySheetEntity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record ActivitySheetDto(
        @NotBlank(message = "Le nom ne doit pas être vide") String name,

        @Min(value = 1, message = "Il faut au moins une personne") int nbrOfPeople,

        @NotBlank(message = "L'objectif ne doit pas être vide") String goal,

        @NotBlank(message = "Le but ne doit pas être vide") String purpose,

        @NotBlank(message = "Le matériel ne doit pas être vide") String material) {
    public ActivitySheetEntity toEntity() {
        return new ActivitySheetEntity(name, nbrOfPeople, goal, purpose, material);
    }

}
