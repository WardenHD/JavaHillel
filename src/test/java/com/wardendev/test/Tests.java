package com.wardendev.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.wardendev.hillelproject.maths.MathFunctions;

public class Tests {

    @Test
    public void testMatrix() {
        double[][] testMatrix = new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        assertTrue(MathFunctions.isMatrixSquare(testMatrix));
    }

    @Test 
    public void testAverage() {
        double[] testArray = new double[]{1, 2, 3, 4};
        double average = MathFunctions.arrayAverage(testArray);

        assertNotNull(average);
    }
}
