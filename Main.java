import javafx.scene.paint.Color;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(Color.BLUE, 1.6f, 4, CarBrand.VOLKSWAGEN);
        Car lorry = new Car(Color.BLUE, 1.6f, 4, CarBrand.VOLKSWAGEN);
        Car truck = new Car(Color.WHITE, 2.5f, 6, CarBrand.MERCEDES_BENZ);

        System.out.println(car.equals(lorry));
        System.out.println(car.equals(truck));
        System.out.println(lorry.equals(truck));
    }
}
