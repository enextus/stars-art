package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class SterneTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @DisplayName("Should increment count")
    @Test
    void testConstructor_one_count_two_count_2() {
        Sterne sterne = new Sterne(); // instantiated one object
        assertEquals(1, Sterne.count, "Should increment count");

        Sterne sterne2 = new Sterne(); // instantiated second object
        assertEquals(2, Sterne.count, "Should increment count");
    }

/*
    @DisplayName("Should increment count")
    @Test
    void testConstructor_one_count_two_count() {
        Sterne sterne = new Sterne(); // instantiated one object
        System.out.println("Count after creating first object: " + Sterne.count);
        assertEquals(1, Sterne.count, "Should increment count");

        Sterne sterne2 = new Sterne(); // instantiated second object
        System.out.println("Count after creating second object: " + Sterne.count);
        assertEquals(2, Sterne.count, "Should increment count");
    }*/

/*	@Test
	void testPrintSterne() {
		Sterne sterne = new Sterne();
		sterne.printSterne();
		String expected = "              \n" +
				"*            +\n" +
				"**          ++\n" +
				"***        +++\n" +
				"****      ++++\n" +
				"*****    +++++\n" +
				"******  ++++++\n";
		assertEquals(expected, outContent.toString(), "Should print a star pattern");
	}*/

/*	@Test
	void testPrintTime() {
		Sterne sterne = new Sterne();
		sterne.printTime();
		LocalTime localTime = LocalTime.now();
		String expected = "\nLocal time: " + localTime.getHour() + ":"
				+ localTime.getMinute() + ":"
				+ localTime.getSecond() + "\n";
		assertEquals(expected, outContent.toString(), "Should print local time");
	}*/
/*
    @Test
    void testCount() {
        Sterne sterne1 = new Sterne();
        Sterne sterne2 = new Sterne();
        assertEquals(2, Sterne.count, "Should increment count for each instance");
    }*/

/*	@Test
	void testCountStaticBlock() {
		new Sterne();
		String expected = "static block: count = 0\n";
		assertEquals(expected, outContent.toString(), "Should print static block message");
	}*/
/*
    @Test
    void testPrintSterneEmpty() {
        Sterne sterne = new Sterne();
        sterne.printSterne();
        String output = outContent.toString();
        assertTrue(output.contains("*"), "Should contain asterisks");
        assertTrue(output.contains("+"), "Should contain plus signs");
        assertFalse(output.contains("!"), "Should not contain exclamation marks");
    }*/

/*	@Test
	void testPrintTimeFormat() {
		Sterne sterne = new Sterne();
		sterne.printTime();
		String output = outContent.toString();
		System.out.println("output: " + output.toString());
		assertTrue(output.matches("\\nLocal time: \\d{1,2}:\\d{1,2}:\\d{1,2}\\n"),
				"Should print local time in correct format");
	}*/

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme