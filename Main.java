import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    // Main
    public static void main(String[] args) {
        task1(new Team(), new Team());
        task2();
    }

    /* Task Functions */ 
    // Task 1
    private static void task1(Team team1, Team team2) {
        System.out.println("\nDoing task1...");
        
        System.out.print("Enter team 1 name: ");
        team1.name = scanner.nextLine();
        team1.playerGoals = new int[]{1, 0, 1, 0, 2};
        System.out.println();
        team1.points = calculateAverage(intArrayToFloat(team1.playerGoals));

        System.out.print("Enter team 2 name: ");
        team2.name = scanner.nextLine();
        team2.playerGoals = new int[]{2, 0, 3, 1, 0};
        team2.points = calculateAverage(intArrayToFloat(team2.playerGoals));

        // shortened if else -- (condition) ? true : false
        String winnerName = (team1.points > team2.points) ? team1.name : team2.name;
        System.out.println("Team \"" + winnerName + "\" won!");
    }

    // Task 2
    private static void task2() {
        System.out.println("\nDoing task2...");

        task2_Check1(3, 2);
        task2_Check1(1, 3);
        task2_Check1(5, 0);

        System.out.println("\n");

        task2_Check2(3, 2);
        task2_Check2(1, 6);
        task2_Check2(5, 0);

    }

    private static void task2_Check1(int a, int b) {
        System.out.println("Checking for a = " + a + " b = " + b);
        boolean ok = a <= 1 && b >= 3;
        System.out.println("Result: " + ((ok) ? a + b + " (Add)" : a - b + " (Subtract)"));
    }

    private static void task2_Check2(int a, int b) {
        System.out.println("Checking for a = " + a + " b = " + b);
        boolean ok = (a > 2 && a < 11) || (b >= 6 && b < 14);
        System.out.println("Result: " + ((ok) ? "Correct" : "Incorrect"));
    }


    // Other Functions
    public static int calculateAverage(float... numbers) {
        float result = 0f;
        for(float i: numbers) result += i;
        return Math.round(result / numbers.length);
    }

    public static float[] intArrayToFloat(int[] array) {
        float[] result = new float[array.length];
        for(int i = 0; i < array.length; i++) result[i] = (float) array[i];
        return result;
    }
}

class Team {
    String name;
    int[] playerGoals;
    int points;
}

