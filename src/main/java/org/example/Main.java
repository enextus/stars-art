package org.example;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Executable task = new SimpleTask();

        task.execute();  // outputs "Simple Task executed"
    }

}
