class PickupTruck extends Vehicle {
    private static final int NUM_OF_WHEELS = 4;
    private static final int PERSON_CAPACITY = 2;
    private static final double MILES_PER_GALLON = 15;
    PickupTruck(String name, Color color) {
        super(name + " the Pickup Truck", color, NUM_OF_WHEELS, PERSON_CAPACITY, MILES_PER_GALLON);
    }

    @Override
    public String drive() {
        return "Wow, the pickup trick is starting to go!";
    }
}