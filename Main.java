import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    static final ThreadLocalRandom random = ThreadLocalRandom.current();
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            boolean guessed = guessNumber();
            System.out.println((guessed) ? "You won the game" : "You didn't guess the number");
            if(guessed) break;
        }

        System.out.println("Press \"ENTER\" to continue...");
        scanner.nextLine();

        for(int i = 0; i < 100; i++) if(!Integer.toString(i).contains("4") && !Integer.toString(i).contains("9")) System.out.println(i);
    }

    public static boolean guessNumber() {
        System.out.print("Enter the number (0-10): ");
        int chosenNumber = random.nextInt(0, 10 + 1);
        boolean guessed = (scanner.nextInt() == chosenNumber);
        System.out.println("The number was " + chosenNumber);
        return guessed;
    }
}