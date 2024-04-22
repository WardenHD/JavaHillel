public class Main {
    public static void main(String[] args) {
        final float[] liAttackPower = multiplyVarargs(860f, 13f, 24f, 46f);
        final float[] minAttackPower = multiplyVarargs(860f * 2f, 9f, 35f, 12f);

        System.out.println("Li Attack Power: " + calculateAverage(liAttackPower));
        System.out.println("Min Attack Power: " + calculateAverage(minAttackPower));
    }

    public static int calculateAverage(float... numbers) {
        float result = 0f;
        for(float i: numbers) result += i;
        return Math.round(result / numbers.length);
    }

    public static float[] multiplyVarargs(float multiplier, float... numbers) {
        float[] result = new float[numbers.length];
        for(int i = 0; i < numbers.length; i++) result[i] = numbers[i] * multiplier;
        return result;
    }

}
