package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private static final String TASK_EXECUTED_MESSAGE = "Task executed: {}";

    public static void main(String[] args) {
        Executable task = new SimpleTask();

        task.execute();  // outputs "Simple Task executed"

        LOGGER.info(TASK_EXECUTED_MESSAGE, "SimpleTask");

    }

}

