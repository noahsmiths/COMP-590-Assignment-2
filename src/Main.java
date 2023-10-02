public class Main {
    public static void main(String[] args) {
        Vehicle baseVehicle = new Vehicle("Victor the Generic Vehicle", Color.Black, 4, 5, 25);
        Vehicle motorcycle = new Motorcycle("Matty", Color.Blue);
        Vehicle sedan = new Sedan("Sadie", Color.Red);
        Vehicle pickup = new PickupTruck("Picard", Color.White);

        Vehicle[] allVehicles = new Vehicle[]{baseVehicle, motorcycle, sedan, pickup};

        int tripDistance = 400;
        for (Vehicle vehicle : allVehicles) {
            System.out.printf("%n%s is about to drive. It will take it about %.2f gallon(s) of gas to make it %d miles.%n", vehicle.getName(), vehicle.calculateGallonsNeeded(400), tripDistance);
            System.out.printf("%s%n", vehicle.drive());
        }
    }
}
