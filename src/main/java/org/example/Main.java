package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Witaj Świecie");

        logger.info("Hello this is an info message");
        logger.debug("Hello this is an debug message");
        logger.warn("Hello this is an warn message");
        logger.error("Hello this is an error message");
    }
}