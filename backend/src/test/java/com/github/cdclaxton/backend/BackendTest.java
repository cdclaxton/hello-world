package com.github.cdclaxton.backend;

import org.junit.Test;
import static org.junit.Assert.*;

public class BackendTest {

    @Test
    public void testGetMessage() {
        assertEquals("Hello, World!", Backend.getMessage());
    }

}