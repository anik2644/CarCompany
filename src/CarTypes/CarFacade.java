package CarTypes;

import CarTypes.Brand.*;
import CarTypes.Usage.MilitaryVehicle;
import CarTypes.Usage.PrivateCar;
import CarTypes.Usage.RacingCar;
import CarTypes.Usage.SUV;

public class CarFacade {
    Brand car = new Brand() {
        @Override
        public void setCartypes(CarTemplate usage) {

        }
    };

    public Brand getCar()
    {
        return this.car;
    }
   public CarFacade(String brand, String usage) {

        if (brand.equalsIgnoreCase("BMW")) {
           this.car = new BMWGroup();
        } else if (brand.equalsIgnoreCase("Toyota")) {
            this.car = new ToyotaGroup();
        } else if (brand.equalsIgnoreCase("Ford")) {
            this.car = new FordGroup();
        } else if (brand.equalsIgnoreCase("Ferrari")) {
            this.car = new FerrariGroup();
        }
        else if (brand.equalsIgnoreCase("Chevrolet")) {
            this.car = new ChevroletGroup();
        }



        if (usage.equalsIgnoreCase("Military")) {
            car.setCartypes(new MilitaryVehicle());
        } else if (usage.equalsIgnoreCase("Private")) {
            car.setCartypes(new PrivateCar());
        }
        else if (usage.equalsIgnoreCase("Racing")) {
            car.setCartypes(new RacingCar());
        }
        else if (usage.equalsIgnoreCase("SUV")) {
            car.setCartypes(new SUV());
        }

        //return car;
    }
}
