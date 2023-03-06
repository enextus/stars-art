package org.example;

import java.util.function.Function;

public class SimpleTask implements Executable {

	@Override
	public void execute() {
		System.out.println("\"Simple Task executed\"\n");

		Sterne st = new Sterne();

		st.printSterne();
		st.printTime();

		// Создание объекта функционального интерфейса с помощью method reference
		Function<String, Integer> converter = Integer::parseInt;
		int number = converter.apply("123"); // number = 123

		System.out.println("number: " + number);
		System.out.print("\nInstances count: " + Sterne.getCount() + "\n");
	}

}
