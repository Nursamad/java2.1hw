package com.company;

public final class Son extends Dad {
    private int height;

    public Son(String name, int age, Home home, Character character, String job, int height) {
        super(name, age, home, character, job);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void printInfo(String name) {
        super.printInfo(name);
    }

    public void copyElements(Son son) {
        this.height = son.getHeight();
    }

}
