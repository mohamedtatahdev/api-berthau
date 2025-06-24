package com.berthaudiere.berthau.service.exception;

public class ActivitySheetNotFoundException extends RuntimeException {
      public ActivitySheetNotFoundException(Long id) {
        super("La fiche d'activité n'a pas été trouver");
    }
}
