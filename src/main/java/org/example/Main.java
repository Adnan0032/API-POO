package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Zoo zoo = new Zoo(5);
            zoo.ajouterSecteur(TypeAnimal.CHIEN);
            zoo.ajouterSecteur(TypeAnimal.CHAT);

            zoo.nouvelAnimal(new Chient("Rex"));
            zoo.nouvelAnimal(new chat("Mimi"));
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();


            System.out.println("Nombre total d'animaux : " + zoo.nombreAnimaux());
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
            }
        }
    }
