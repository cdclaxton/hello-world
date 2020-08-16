package com.github.cdclaxton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Package name: " + Main.class.getPackage().getName());
        System.out.println("Running version: " + Main.class.getPackage().getImplementationVersion());
    }
}
