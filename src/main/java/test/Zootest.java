package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class Zootest {
    @Test()
    public void testAjoutAnimal() throws Exception {
        Zoo zoo = new Zoo(10);
        zoo.ajouterSecteur(TypeAnimal.CHAT);
    }

    @Test(expected = AnimalDansMauvaisSecteurException.class)
    public void testAnimalDansMauvaisSecteur() throws Exception {
        Zoo zoo = new Zoo(10);
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        zoo.nouvelAnimal(new Chient("Rex"));
    }

}
