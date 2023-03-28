package org.hemuWorld.mypack;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {
    public static final Logger logger = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.debug("Debug App");
        logger.info("Info App");
        logger.warn("Warning App");
        logger.error("Error App");
        logger.fatal("Fatal App");
        logger.log(Level.getLevel("DIAG"), "DIAG");
        logger.log(Level.getLevel("NOTICE"), "NOTICE");
        logger.log(Level.getLevel("VERBOSE"), "VERBOSE");
    }
}
