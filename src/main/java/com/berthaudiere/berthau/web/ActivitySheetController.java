package com.berthaudiere.berthau.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.berthaudiere.berthau.ActivitySheetList;
import com.berthaudiere.berthau.web.sheet.ActivitySheet;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "ActivitySheets API")
@RestController

public class ActivitySheetController {
    // anotation swagger
    @Operation(summary = "Récuperer toutes les fiches d'activités", description = "Finds ActivitySheets")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ActivitySheets list", content = {
                    @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ActivitySheet.class))) })

    })

    // recuperer tous les fiches
    @GetMapping("/fiches-activites")
    public List<ActivitySheet> findAll() {
        return ActivitySheetList.ALL;
    };

    @Operation(summary = "Récuperer une fiche d'activité par l'id", description = "Find a ActivitySheet")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ActivitySheet", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ActivitySheet.class)) }),
                    @ApiResponse(responseCode = "404", description = "Not found")


    })

    //recupere une fiche d'activite via l'id
    @GetMapping("/fiche-activite/{id}")
    public ActivitySheet findById(@PathVariable("id") Integer id) {
        return ActivitySheetList.ALL.stream()
            .filter(activitySheet -> activitySheet.getId().equals(id))
            .findFirst()
            .orElseThrow();
    }

    @Operation(summary = "Crée une fiche d'activité", description = "Creates a ActivitySheet")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Created ActivitySheet",
                content = {@Content(mediaType = "application/json",
                        schema = @Schema(implementation = ActivitySheet.class))})

})
    @PostMapping("/fiche-activite")
public ActivitySheet createActivitySheet(@RequestBody @Valid ActivitySheet activitySheet) {
    return activitySheet;
}

   @Operation(summary = "modifier une fiche d'activité", description = "update a ActivitySheet")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "updated ActivitySheet",
                content = {@Content(mediaType = "application/json",
                        schema = @Schema(implementation = ActivitySheet.class))})

})
@PutMapping("/fiches-activites")
public ActivitySheet updateActivitySheet(@RequestBody @Valid ActivitySheet activitySheet) {
    return activitySheet;
}

   @Operation(summary = "delete a ActivitySheet", description = "delete a ActivitySheet")
@ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "La fiche d'activité a bien été supprimé")

})
@DeleteMapping("/fiche-activite/{id}")
public void deleteActivtitySheetById(@PathVariable("id") Integer id) {

}
}
