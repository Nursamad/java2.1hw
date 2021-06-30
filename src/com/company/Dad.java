package com.company;

public class Dad extends GrandFather {
    private String job;

    public Dad(String name, int age, Home home, Character character, String job) {
        super(name, age, home, character);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void printInfo(String name){
        System.out.println("Name: " + name);
    }

    public final void printInfo(int age , Character character){
        System.out.println("Age: "+age + "\nCharacter: " + character);
    }

}