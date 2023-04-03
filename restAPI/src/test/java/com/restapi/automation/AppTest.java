package com.restapi.automation;

import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.restassured.RestAssured.*;
import io.restassured.response.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.junit.Before;
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


        @Before
        public void setuo ()
        {
            RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";

        }
        @Test
    public void shouldAnswerWithTrue()
    {

        Response response;
        RequestSpecification httprequest = RestAssured.given();
        response = httprequest.get();
        String resp = response.asPrettyString();
        logger.info(resp);

        httprequest.get().then().body("books.findALl",
        logger.info("Test Message info");
        logger.info(resp);
        logger.info("Test Message info");
        logger.error("Test error message");
        logger.debug("Test error message");
    }
}
