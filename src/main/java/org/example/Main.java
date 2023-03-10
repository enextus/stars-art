package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                SimpleTask simpleTask = new SimpleTask();
                simpleTask.execute();
            });
            thread.start();
            thread.join(); // block thread until SimpleTask completes
        }
    }

}
