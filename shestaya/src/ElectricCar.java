public class ElectricCar extends Vehicle implements Fuelable {
    private int batteryLevel;

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.batteryLevel = 0;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + "" + getModel() + " начал(ла) работу" );

    }

    @Override
    public void stop() {
        System.out.println(getBrand() + "" + getModel() + " закончил(ла) работу" );
    }
    @Override
    public void refuel(int percent){
        if (batteryLevel + percent>100){
            batteryLevel = 100;
            System.out.println("Заряд полон");
        }
        else {
            batteryLevel+=percent;
            System.out.println("Электромашина была заряжена на " + percent + "%." + " Уровень заряда равен: " + batteryLevel +"%.");
        }
    }

    @Override
    public int getFuelLevel() {
        return batteryLevel;
    }

    @Override
    public void refuel(double percent){
    if (batteryLevel + percent>100){
        batteryLevel = 100;
        System.out.println("Заряд полон");
    }
    else {
        batteryLevel+=percent;
        System.out.println("Электромашина была заряжена на " + percent + "%." + " Уровень заряда равен: " + batteryLevel +"%.");
    }
}

}

