package CarTypes;


// Main client code

// CarGroup hierarchy
public abstract class CarGroup {
    protected abstract String getGroupName();
    protected abstract String getBodyDesign();
    protected abstract CarTemplate createCar(String variant);

    public void buildCars() {
        System.out.println("Building cars for " + getGroupName() + " group with " + getBodyDesign() + " body design:");

        CarTemplate[] cars = {
                createCar("Racing Car"),
                createCar("Private Car"),
                createCar("SUV"),
                createCar("Military Vehicle")
        };

        for (CarTemplate car : cars) {
            car.buildCar();
            System.out.println();
        }
    }
}

// Main client code

