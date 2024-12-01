package org.example;

public class AnimalDansMauvaisSecteurException extends Exception {
    public AnimalDansMauvaisSecteurException(String message) {
        message="l'animal est dans un mauvais secteur";
        System.out.println("AnmalDansMauvaisSecteur: " + message);
    }
}
