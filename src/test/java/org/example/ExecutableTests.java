package org.example;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExecutableTests {
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
