public  class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("Lada", "Priora"),
                new ElectricCar("Tesla", "Cybertruck"),
                new Truck("KAMAZ", "54901"),
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            ((Fuelable) vehicle).refuel(50);
            ((Fuelable) vehicle).refuel(2.5);
            System.out.println("Fuel level: " + ((Fuelable) vehicle).getFuelLevel());
            System.out.println(" ");
        }
    }
}