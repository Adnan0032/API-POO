package org.example;

public abstract class Animal {
    protected String nomAnimal;

    public Animal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public abstract TypeAnimal getTypeAnimal();
}
