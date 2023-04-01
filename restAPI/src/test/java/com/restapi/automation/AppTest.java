package com.restapi.automation;

import static org.junit.Assert.assertTrue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest
    {
    public static Logger logger = LogManager.getLogger(AppTest.class);
        /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true     );
        logger.info("Test Message info");
        logger.error("Test error message");
        logger.debug("Test error message");
    }
}
