package com.github.cdclaxton.frontend;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontendTest {

    @Test
    public void testGetMessage() {
        Frontend frontend = new Frontend();
        assertEquals("Hello, World!", frontend.getMessageFromBackend());
    }

}
