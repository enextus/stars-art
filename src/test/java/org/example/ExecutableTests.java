package org.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExecutableTests {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
/*
    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }*/

	@DisplayName("Should increment count")
	@Test
	void testConstructor_one_count_two_count() {
		Sterne sterne = new Sterne(); // instantiated one object
		System.out.println("Count after creating first object: " + Sterne.getCount());
		assertEquals(1, Sterne.getCount(), "Should increment count");

		Sterne sterne2 = new Sterne(); // instantiated second object
		System.out.println("Count after creating second object: " + Sterne.getCount());
		assertEquals(2, Sterne.getCount(), "Should increment count");
	}

	@Test
	void testExecute() {
		Executable executable = () -> System.out.println("Executing...");
		assertDoesNotThrow(executable::execute, "Should not throw any exception");
	}

	@Test
	void testExecuteMultipleTimes() {
		AtomicInteger count = new AtomicInteger();
		Executable executable = () -> count.getAndIncrement();
		executable.execute();
		executable.execute();
		executable.execute();

		assertEquals(3, count.get(), "Should have been executed three times");
	}

}
