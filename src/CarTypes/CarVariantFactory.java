package CarTypes;

import CarTypes.Usage.MilitaryVehicle;
import CarTypes.Usage.PrivateCar;
import CarTypes.Usage.RacingCar;
import CarTypes.Usage.SUV;

// CarVariantFactory class
public class CarVariantFactory {
    private String variant;

    public CarVariantFactory(String variant) {
        this.variant = variant;
    }

    public CarTemplate createCar() {
        if (variant.equalsIgnoreCase("Racing Car")) {
            return new RacingCar();
        } else if (variant.equalsIgnoreCase("Private Car")) {
            return new PrivateCar();
        } else if (variant.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else if (variant.equalsIgnoreCase("Military Vehicle")) {
            return new MilitaryVehicle();
        } else {
            throw new IllegalArgumentException("Invalid car variant: " + variant);
        }
    }
}
