package org.hemuWorld.oldPack;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.hemuWorld.mypack.App.logger;

/**
 * Hello world!
 */
public class MyApp {

    public static void main(String[] args) {
        logger.debug("Debug MyApp");
        logger.info("Info MyApp");
        logger.warn("Warning MyApp");
        logger.error("Error MyApp");
        logger.fatal("Fatal MyApp");
    }
}
