enum Color {Red, Blue, Black, Grey, White};

class Vehicle {
    private String name;
    private Color color;
    private final int numOfWheels;
    private final int personCapacity;
    private final double milesPerGallon;

    Vehicle(String name, Color color, int numOfWheels, int personCapacity, double milesPerGallon) {
        this.name = name;
        this.color = color;
        this.numOfWheels = numOfWheels;
        this.personCapacity = personCapacity;
        this.milesPerGallon = milesPerGallon;
    }

    /* Setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /* Getters */
    public String getName() {
        return this.name;
    }

    public Color getColor() {
        return this.color;
    }

    public int getNumOfWheels() {
        return this.numOfWheels;
    }

    public int getPersonCapacity() {
        return this.personCapacity;
    }

    public double getMilesPerGallon() {
        return this.milesPerGallon;
    }

    /* Other methods */
    public double calculateGallonsNeeded(double miles) {
        return miles / this.milesPerGallon;
    }

    public String drive() {
        return "Yowza, the vehicle is now driving!";
    }
}