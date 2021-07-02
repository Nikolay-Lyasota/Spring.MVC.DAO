package web.model;

public class Car {

    private String name;

    private int maxSpeed;

    private double fuelConsumption;

    public Car() {
    }

    public Car(String name, int maxSpeed, double fuelConsumption) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "CarName: " + getName() + " CarMaxSpeed: " + getMaxSpeed() + " CarFuelConsumption: " + getFuelConsumption() + " ";
    }
}
