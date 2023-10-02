class Motorcycle extends Vehicle {
    private static final int NUM_OF_WHEELS = 2;
    private static final int PERSON_CAPACITY = 2;
    private static final double MILES_PER_GALLON = 75;
    Motorcycle(String name, Color color) {
        super(name + " the Motorcycle", color, NUM_OF_WHEELS, PERSON_CAPACITY, MILES_PER_GALLON);
    }

    @Override
    public String drive() {
        return "Holy moly, the motorcycle is going fast!";
    }
}