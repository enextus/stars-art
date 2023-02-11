package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final String TASK_EXECUTED_MESSAGE = "Task executed: {}";
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Executable task = new SimpleTask();
        task.execute();  // outputs "Simple Task executed"

        logger.info(TASK_EXECUTED_MESSAGE, task.toString());
    }

}
