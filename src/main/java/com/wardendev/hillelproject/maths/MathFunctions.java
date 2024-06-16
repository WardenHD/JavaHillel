package com.wardendev.hillelproject.maths;

public class MathFunctions {
    public static double arrayAverage(double... numbers) {
        double result = 0;
        for (double number : numbers) result += number;
        return result / numbers.length;
    }

    public static boolean isMatrixSquare(double[][] matrix) {
        boolean ok = true;
        for (double[] row : matrix) if (row.length != matrix.length) ok = false;
        return ok;
    }
}
