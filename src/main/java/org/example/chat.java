package org.example;

public class chat extends Animal {
    public chat(String nomAnimal) {
        super(nomAnimal);
    }

    @Override
    public TypeAnimal getTypeAnimal() {
        return TypeAnimal.CHAT;
    }
}