package org.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SimpleTask implements Executable {

    private static final Logger logger = LogManager.getLogger(SimpleTask.class);

    @Override
    public void execute() {
        System.out.println("Simple Task executed");

        Sterne st = new Sterne();

        st.printSterne();
        st.printTime();

        /* System.out.println("Instances count: " + Sterne.count + "\n"); */
        System.out.print("Instances count: " + Sterne.count);

        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        logger.warn("Warn log message");
        logger.fatal("Fatal log message");
        logger.trace("Trace log message");
    }

}
