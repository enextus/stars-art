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

	@DisplayName("testPrintSterne :)")
	@Test
	public void testPrintSterne() {
		System.setOut(new PrintStream(outContent));
		Sterne sterne = new Sterne();
		sterne.printSterne();
		assertEquals("""
						static block: count = 0
						           \s
						*          +
						**        ++
						***      +++
						****    ++++
						*****  +++++
						******++++++
						""",
				outContent.toString());
	}

	@Test
	void testCount() {
		Sterne sterne1 = new Sterne();
		Sterne sterne2 = new Sterne();
		assertEquals(2, Sterne.count, "Should increment count for each instance");
	}

	@Test
	void testPrintSterneEmpty() {
		Sterne sterne = new Sterne();
		sterne.printSterne();
		String output = outContent.toString();
		assertTrue(output.contains("*"), "Should contain asterisks");
		assertTrue(output.contains("+"), "Should contain plus signs");
		assertFalse(output.contains("!"), "Should not contain exclamation marks");
	}

	@Test
	void testPrintTimeFormat() {
		Sterne sterne = new Sterne();

		sterne.printTime();



		String output = outContent.toString();

//		System.out.println("output: " + output);

		System.out.println("output: " + output.toString());
		assertTrue(output.matches("\\nLocal time: \\d{1,2}:\\d{1,2}:\\d{1,2}\\n"),
				"Should print local time in correct format");
	}

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme