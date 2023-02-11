package org.example;

public class Main {

    private static final String TASK_EXECUTED_MESSAGE = "Task executed: {}";

    public static void main(String[] args) {
        Executable task = new SimpleTask();

        task.execute();  // outputs "Simple Task executed"
    }

}
