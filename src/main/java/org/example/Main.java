package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger("Sterne Class");

    public static void main(String[] args) {

        Sterne st = new Sterne();

        st.printSterne();
        st.printTime();

        System.out.println("Instances count: " + Sterne.count + "\n");

        logger.info("Sterne done!");


    }

}
