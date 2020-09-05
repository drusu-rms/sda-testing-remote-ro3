package com.qatools.ro.calculate;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class Calculate {

    public static int calculate(final int number1, final int number2, final int operationCode){
        switch (operationCode){
            case 1: return number1 + number2; // SUM
            case 2: return number1 * number2; // MULTIPLICATION
            case 3: {                         // DIVISION
                if (number2 == 0){
                    throw new Error("cannot divide by 0");
                }
                return number1 / number2;
            }
            default: throw new Error("wrong operation code " + operationCode);
        }
    }

    @Test
    public void testSum(){
        final int result = calculate(5, 5, 1);
        assertEquals(result, 10);
    }

    @Test
    public void testMultiplication(){
        final int result = calculate(5, 5, 2);
        assertEquals(result, 25);
    }

    @Test
    public void testDivision(){
        final int result = calculate(5, 5, 3);
        assertEquals(result, 1);
    }

    @Test
    public void testDivisionBy0(){
        assertThrows(
                Error.class,
                () -> calculate(5, 0, 3));
    }

    @Test
    public void testWrongOperation(){
        assertThrows(
                Error.class,
                () -> calculate(5, 5, 4));
    }

}
