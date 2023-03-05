package org.example;

import java.util.function.Function;

public class SimpleTask implements Executable {

    @Override
    public void execute() {
        System.out.println("Simple Task executed");

        Sterne st = new Sterne();

        st.printSterne();
        st.printTime();

        // Создание объекта функционального интерфейса с помощью method reference
        Function<String, Integer> converter = Integer::parseInt;
        int number = converter.apply("12345"); // number = 123

        System.out.println("number: " + number);

        /* System.out.println("Instances count: " + Sterne.count + "\n"); */
        System.out.print("Instances count: " + Sterne.getCount());
    }

}
