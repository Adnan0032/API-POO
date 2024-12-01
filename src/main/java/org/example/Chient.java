package org.example;

public class Chient extends Animal {
    public Chient(String nomAnimal) {
        super(nomAnimal);
    }

    @Override
    public TypeAnimal getTypeAnimal() {
        return TypeAnimal.CHIEN;
    }
}
