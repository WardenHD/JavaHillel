import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static final ThreadLocalRandom random = ThreadLocalRandom.current();

    public static void main(String[] args) {
        int[] team1 = fillArrayRandom(new int[5]);
        int[] team2 = random.ints(5, 18, 40).toArray();

        printArray("Team 1 players:", team1);
        printArray("Team 2 players:", team2);
        System.out.println("Team 1 average: " + calculateAverage(intToDoubleArray(team1)));
        System.out.println("Team 2 average: " + calculateAverage(intToDoubleArray(team2)));
    }

    public static int[] fillArrayRandom(int[] array) {
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(18, 40);
        return array;
    }

    public static void printArray(String prompt, int[] array) {
        System.out.println((prompt == null) ? "" : prompt + " " + 
            Arrays.toString(array).replace('[', '\0').replace(']', '\0'));
    }

    public static double calculateAverage(double... args) {
        double result = 0;
        for (double d : args) result += d;
        return result / args.length;
    }

    public static double[] intToDoubleArray(int[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) result[i] = (double) array[i];
        return result;
    }
}