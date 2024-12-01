package org.example;

public class LimiteVisiteurException extends Exception {
    public LimiteVisiteurException(String message) {
        message="Vous avez depasser le nombre des visiteurs";
        System.out.println("LimiteVisiteurException: " + message);

    }
}
