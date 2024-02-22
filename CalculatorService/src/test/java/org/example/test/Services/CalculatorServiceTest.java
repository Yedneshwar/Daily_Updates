package org.example.test.Services;
import java.time.*;
import java.util.Date;
import junit.framework.Assert;
import org.example.test.CalculatorService;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.lang.Exception;
import java.lang.InterruptedException;
import java.util.concurrent.TimeoutException;

public class CalculatorServiceTest
{
    Timeout e;
    int counter = 0;

    @BeforeClass
    public static void init()
    {
        System.out.println("Before All testcases");
        System.out.println("Started Test : "+new Date());
    }
    @Before
    public void beforeEach()
    {
        System.out.println("Before");
    }

    @Test(timeout = 1)
    public void addTwoNumbersTest()
    {


        for(int i = 0;i <= 20;i++)
        {
            counter += i;
        }

        int result = CalculatorService.addTwoNumbers(12,45);
        int expected = 57;
        System.out.println("efdsf"+counter);
        Assert.assertEquals(expected , result);
        //actual result and expected result
    }
    @Test(timeout = 2)
    public void sumAnyNumbersTest()
    {
        int result = CalculatorService.sumAnyNumbers(2,7,8,9);
        int exres = 26;
        Assert.assertEquals(exres,result);
    }
    @AfterClass
    public static void cleanup()
    {
        System.out.println("Afterall Test cases");
    }
}
