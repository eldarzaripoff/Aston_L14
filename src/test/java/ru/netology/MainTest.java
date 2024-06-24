package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;

class MainTest {

    @org.junit.jupiter.api.Test
    void factorialHavingLargeResult() {
        //GIVEN
        int parameter = 50;
        BigInteger expected = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        //WHEN
        BigInteger actual = Main.factorialHavingLargeResult(parameter);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFactorialWithValidInput() {
        //GIVEN
        int parameter = 10;
        BigInteger expected = new BigInteger("3628800");
        //WHEN
        BigInteger actual = Main.factorialHavingLargeResult(parameter);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -5, -10})
    void testFactorialWithInvalidInput(int parameter) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.factorialHavingLargeResult(parameter));
    }


}