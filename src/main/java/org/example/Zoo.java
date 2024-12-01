package org.example;

import java.util.List;
import java.util.ArrayList;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    private int nbVisiteurMaxParSecteur;

    public Zoo(int nbVisiteurMaxParSecteur) {
        this.nbVisiteurMaxParSecteur = nbVisiteurMaxParSecteur;
        this.secteursAnimaux = new ArrayList<>();
        this.visiteurs = 0;
    }

    public void ajouterSecteur (TypeAnimal typeAnimal) {
        Secteur secteur = new Secteur(typeAnimal);
        secteursAnimaux.add(secteur);
    }

    public void nouveauVisiteur() throws LimiteVisiteurException {
        if (visiteurs + 1 > nbVisiteurMaxParSecteur * secteursAnimaux.size()) {
            throw new LimiteVisiteurException("Nombre maximum de visiteurs atteint ");
        }
        visiteurs++;
    }

    public int getLimiteVisiteur() {
        return nbVisiteurMaxParSecteur * secteursAnimaux.size();
    }

    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
        for (Secteur secteur : secteursAnimaux) {
            if (secteur.obtenirType() == animal.getTypeAnimal()) {
                secteur.ajouterAnimal(animal);
                return;
            }
        }
        throw new AnimalDansMauvaisSecteurException("Animal dans le mauvais secteur !");
    }

    public int nombreAnimaux() {
        int total = 0;
        for (Secteur secteur : secteursAnimaux) {
            total += secteur.getNombreAnimaux();
        }
        return total;
    }
}
