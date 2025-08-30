package org.example;

import static org.example.App.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String username = "Vijay Deshmukh";
        String username1 = "VIjay Deshmukh&";
        String username2 = "Vijay_Deshmukh";
        assertFalse(isValidUserName(username));

        assertFalse(isValidUserName(username1));

        assertFalse(isValidUserName(username2));

    }

}
