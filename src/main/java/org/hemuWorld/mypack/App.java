package org.hemuWorld.mypack;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {
    private static final Logger log = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) {
        log.debug("Debug App");
        log.info("Info App");
        log.warn("Warning App");
        log.error("Error App");
        log.fatal("Fatal App");
    }
}
