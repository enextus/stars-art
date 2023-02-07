package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger("Sterne Class");

    public static void main(String[] args) {
        Executable task = new SimpleTask();
        task.execute();  // outputs "Simple Task executed"
    }

}
