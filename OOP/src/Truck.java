public class Truck extends Vehicle implements Fuelable {
    private int fuelLevel;

    public Truck(String brand, String model) {
        super(brand, model);
        this.fuelLevel = 0;
    }


    @Override
    public void refuel(int liters) {
        if (fuelLevel + liters>100){
            System.out.println("Бак полон");
        }
        else {
            fuelLevel+=liters;
            System.out.println("Грузовик был заправлен на " + liters + ". Уровень топлива равен: " + fuelLevel);
        }


    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + "" + getModel() + " начал(ла) работу" );

    }

    @Override
    public void stop() {
        System.out.println(getBrand() + "" + getModel() + " закончил(ла) работу" );

    }
}
