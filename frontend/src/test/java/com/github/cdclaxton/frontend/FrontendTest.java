package com.github.cdclaxton.frontend;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontendTest {

    @Test
    public void testGetMessage() {
        assertEquals("Hello, World!", Frontend.getMessageFromBackend());
    }

}
