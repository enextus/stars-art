package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleTask implements Executable {

    private static final Logger logger = LogManager.getLogger("Sterne Class");
    
    @Override
    public void execute() {
        System.out.println("Simple Task executed");

        Sterne st = new Sterne();

        st.printSterne();
        st.printTime();

        System.out.println("Instances count: " + Sterne.count + "\n");

        String stlog = logger.getName();

        System.out.println("stlog: " + stlog);

        logger.info("Sterne done!");
    }
}
