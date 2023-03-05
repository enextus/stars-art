package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                SimpleTask simpleTask = new SimpleTask();
                simpleTask.execute();
            });
            thread.start();
        }
    }
}