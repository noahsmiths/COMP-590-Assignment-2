class Sedan extends Vehicle {
    private static final int NUM_OF_WHEELS = 4;
    private static final int PERSON_CAPACITY = 4;
    private static final double MILES_PER_GALLON = 30;

    Sedan(String name, Color color) {
        super(name + " the Sedan", color, NUM_OF_WHEELS, PERSON_CAPACITY, MILES_PER_GALLON);
    }

    @Override
    public String drive() {
        return "Hey, the sedan has started to move!";
    }
}