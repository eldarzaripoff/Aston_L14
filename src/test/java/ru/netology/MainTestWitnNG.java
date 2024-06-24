package ru.netology;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class MainTestWitnNG {
    @Test
    public void factorialHavingLargeResult() {
        //GIVEN
        int parameter = 50;
        BigInteger expected = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        //WHEN
        BigInteger actual = Main.factorialHavingLargeResult(parameter);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testFactorialWithValidInput() {
        //GIVEN
        int parameter = 10;
        BigInteger expected = new BigInteger("3628800");
        //WHEN
        BigInteger actual = Main.factorialHavingLargeResult(parameter);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @DataProvider(name = "invalidInputs")
    public Object[] invalidInputsProvider() {
        return new Object[] {0, -5, -10};
    }


    @Test(dataProvider = "invalidInputs", expectedExceptions = IllegalArgumentException.class)
    public void testFactorialWithInvalidInput(int n) {
        Main.factorialHavingLargeResult(n);
    }

}