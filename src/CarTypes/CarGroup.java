package CarTypes;


// Main client code

// CarGroup hierarchy
public abstract class CarGroup {
    protected abstract String getGroupName();

    public abstract CarTemplate getCarTypes();
    public abstract int getPrice();

    protected abstract String getBodyDesign();

    protected abstract CarTemplate createCar(String variant);


    public void buildCars() {
        System.out.println("Building cars for " + getGroupName() + " group with " + getBodyDesign() + " body design:");
        System.out.println("Used for " + getCarTypes().getCarType());

        CarTemplate[] cars = {
                createCar("Racing Car"),
                createCar("Private Car"),
                createCar("SUV"),
                createCar("Military Vehicle")
        };

//        for (CarTemplate car : cars) {
//            car.buildCar();
//            System.out.println();
//        }
    }


    public void pricing() {
        System.out.println("Price of the car is " + getGroupName() + " group with " + getBodyDesign() + " body design:");
        //System.out.println("Used for " + getCarTypes().getCarType());



    }
}

// Main client code

