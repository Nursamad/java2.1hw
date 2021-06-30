package com.company;

public class GrandFather {
    private String name;
    private int age;
    private Home home;
    private Character character;


    public GrandFather(String name, int age, Home home, Character character) {
        this.name = name;
        this.age = age;
        this.home = home;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Home getHome() {
        return home;
    }

    public Character getCharacter() {
        return character;
    }
}

