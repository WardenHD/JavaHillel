public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("unused") // added to remove warnings
        BurgerMain burgers = new BurgerMain();
    }
}

@SuppressWarnings("unused")
class BurgerMain {
    private final Burger standartBurger;
    private final Burger dietBurger;
    private final Burger doubleMeatBurger;

    public BurgerMain() {
        this.standartBurger = new Burger();
        this.dietBurger = new Burger(true, 1, true, true, false);
        this.doubleMeatBurger = new Burger(true, 2, true, true, true);
    }
}

@SuppressWarnings("unused")
class Burger {
    private final boolean buns;
    private final int meatAmount;
    private final boolean cheese;
    private final boolean herbs;
    private final boolean mayonnaise;

    public Burger() {
        this(true, 1, true, true, true);
    }

    public Burger(boolean buns, int meatAmount, boolean cheese, boolean herbs, boolean mayonnaise) {
        this.buns = buns;
        this.meatAmount = meatAmount;
        this.cheese = cheese;
        this.herbs = herbs;
        this.mayonnaise = mayonnaise;

        System.out.println("\n---Ingredients of Burger---");
        System.out.println("  Buns: " + ((buns) ? "Present" : "Not present"));
        System.out.println("  Meat: " + meatAmount + "x");
        System.out.println("  Cheese: " + ((cheese) ? "Present" : "Not present"));
        System.out.println("  Herbs: " + ((herbs) ? "Present" : "Not present"));
        System.out.println("  Mayonnaise: " + ((mayonnaise) ? "Present" : "Not present"));
        System.out.println("---------------------------\n");
    }
}