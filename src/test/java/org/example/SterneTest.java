package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SterneTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testPrintSterne() {
        System.setOut(new PrintStream(outContent));
        Sterne sterne = new Sterne();
        sterne.printSterne();
        assertEquals("            \n*          *\n**        **\n***      ***\n****    ****\n*****  *****\n************\n", outContent.toString());
    }

}
