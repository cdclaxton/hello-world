package com.github.cdclaxton.frontend;

import com.github.cdclaxton.backend.Backend;

public class Frontend {

    public static void main(String[] args) {
        System.out.println(getMessageFromBackend());
        System.out.println("Running front-end version: " + Frontend.class.getPackage().getImplementationVersion());
        System.out.println("Running back-end version: " + Backend.class.getPackage().getImplementationVersion());
    }

    static String getMessageFromBackend() {
        return Backend.getMessage();
    }

}
