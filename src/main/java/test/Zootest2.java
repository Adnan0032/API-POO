package test;
import static org.junit.Assert.*;

import org.example.LimiteVisiteurException;
import org.example.TypeAnimal;
import org.example.Zoo;
import org.junit.Test;

    public class Zootest2 {
        @Test(expected = LimiteVisiteurException.class)
        public void testDepassementNombreMaxVisiteurs() throws Exception {
            Zoo zoo = new Zoo(2);

            zoo.ajouterSecteur(TypeAnimal.CHIEN);
            zoo.ajouterSecteur(TypeAnimal.CHAT);
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
        }
    }
