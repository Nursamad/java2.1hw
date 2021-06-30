package com.company;

public class Main {

    public static void main(String[] args) {
        Dad a = new Dad("Sardar", 40, new Home("Sydykova 113", "Bishkek"), Character.KIND, "Lawyer");
        System.out.println("Name: " + a.getName() + "; Age: " + a.getAge() + "; Address: " + a.getHome().getAddress() + "; City: " + a.getHome().getCity() +
                "; Character: " + a.getCharacter() + "; Job: " + a.getJob());
        a.printInfo(a.getName());
        Son b = new Son("Manas", 20, new Home("Leninskaya 19/2", "Moskow"), Character.HARD, "Doctor", 178);
        System.out.println("Name: " + b.getName() + "; Age: " + b.getAge() + "; Address: " + b.getHome().getAddress() + "; City: " + b.getHome().getCity() +
                "; Character: " + b.getCharacter() + "; Job: " + b.getJob() + "; Height: " + b.getHeight());
        b.printInfo(b.getAge() , b.getCharacter());
        Son c = new Son("Ilim", 17, new Home("Sydykova 113", "Bishkek"), Character.AGRESSIVE, "Waiter", 181);
        System.out.println("Name: " + c.getName() + "; Age: " + c.getAge() + "; Address: " + c.getHome().getAddress() + "; City: " + c.getHome().getCity() +
                "; Character: " + c.getCharacter() + "; Job: " + c.getJob() + "; Height: " + c.getHeight());
        c.copyElements(b);
        System.out.println("Name: " + c.getName() + "; Age: " + c.getAge() + "; Address: " + c.getHome().getAddress() + "; City: " + c.getHome().getCity() +
                "; Character: " + c.getCharacter() + "; Job: " + c.getJob() + "; Height: " + c.getHeight());
        c.printInfo(c.getName());
    }
}
