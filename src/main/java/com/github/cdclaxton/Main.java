package com.github.cdclaxton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World! This is a Java project for testing Jenkins.");
        System.out.println("Package name: " + Main.class.getPackage().getName());
        System.out.println("Running version: " + Main.class.getPackage().getImplementationVersion());
    }
}
