package org.hemuWorld;

import static org.hemuWorld.mypack.App.logger;

public class LogExtension {

    public static void main(String[] args) {
        logger.debug("Debug MyApp");
        logger.info("Info MyApp");
        logger.warn("Warning MyApp");
        logger.error("Error MyApp");
        logger.fatal("Fatal MyApp");
    }

}
