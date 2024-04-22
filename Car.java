import java.util.Objects;

import javafx.scene.paint.Color;

public class Car {
    private final Color color;
    private final float engineVolume;
    private final int wheels;
    private final CarBrand brand;

    public Car(Color color, float engineVolume, int wheels, CarBrand brand) {
        this.color = color;
        this.engineVolume = engineVolume;
        this.wheels = wheels;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car that = (Car) obj;
        return color == that.color && engineVolume == that.engineVolume && wheels == that.wheels && brand == that.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engineVolume, wheels, brand);
    }
}

enum CarBrand {
    PLYMOUTH,
    PONTIAC,
    SAAB,
    BUICK,
    BMW,
    MERCEDES_BENZ,
    VOLKSWAGEN,
    SEAT,
    SKODA,
    BUGATTI,
    AUDI,
    PORSCHE,
    LAMBORGHINI,
    BENTLEY,
    MAN,
    SCANIA
}