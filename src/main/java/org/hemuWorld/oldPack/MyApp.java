package org.hemuWorld.oldPack;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class MyApp {
    private static final Logger log = LogManager.getLogger(MyApp.class.getName());

    public static void main(String[] args) {
        log.debug("Debug MyApp");
        log.info("Info MyApp");
        log.warn("Warning MyApp");
        log.error("Error MyApp");
        log.fatal("Fatal MyApp");
    }
}
