public abstract class Vehicle {
    private String brand;
    private String model;

    public abstract void start();

    public abstract void stop();

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public Vehicle(String brand, String model){
    this.brand = brand;
    this.model= model;
    }
    @Override
    public String toString(){
        return "Марка: "+ brand + ",Модель: " + model;
    }

}
