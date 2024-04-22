import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<Menu> chosenDishes = new ArrayList<Menu>();

    public static void main(String[] args) {
        while(true) {
            chooseDish();
            
            if(!askIfAll()) break;
        }
    }

    private static void chooseDish() {
        String dish;
        while(true) {
            System.out.print("Say chosen dish: ");
            dish = scanner.next().toUpperCase();
            try { 
                Menu chosenDish = Menu.valueOf(dish);
                System.out.println(chosenDish);
                System.out.println("Chosen dish: " + chosenDish);
                chosenDishes.add(chosenDish);
                break; 
            }
            catch(Exception e) { 
                System.out.println("Sorry, this dish isn't available"); 
                System.out.print("Available items: ");
                for(Menu d : Menu.values()) System.out.print(d + ", ");
                System.out.println(" \nChoose again.\n");
            }
        }
    }

    private static boolean askIfAll() {
        while(true) {
            System.out.print("Is there anything more (yes/no)?: ");
            String input = scanner.next().toLowerCase();
            System.out.println(input);
            if(input.equals("no")) {
                System.out.println("This what you have chosen:\n");
                for (Menu menu : chosenDishes) System.out.println(menu);
                System.out.println("\n");
                return false;
            } 
            else if(input.equals("yes")) return true;
            else System.out.println("Did not hear you, repeat please\n"); 
        }
    }
}

// Sorry, didn't used switch :(
enum Menu {
    COKE("Coke", 6),
    WATER("Water", 1),
    JUICE("Juice", 3),
    PASTA("Pasta", 10),
    HAMBURGER("Hamburger", 8),
    PIZZA("Pizza", 15);

    private String name;
    private int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " $" + (float) price;
    }
}