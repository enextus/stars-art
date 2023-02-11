package org.example;

public class SimpleTask implements Executable {

    @Override
    public void execute() {
        System.out.println("Simple Task executed");

        Sterne st = new Sterne();

        st.printSterne();
        st.printTime();

        System.out.println("Instances count: " + Sterne.count + "\n");
    }

}
