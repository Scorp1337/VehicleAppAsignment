package org.example;

/**
    This is a vehicle app that allows us to calculate fuel consumption on different Cars with different parameters.
 */
public abstract class Car implements Vehicle {

    protected double availableFuel;

    protected String chassisNumber;

    protected int tireSize;
    protected final double fuelTankSize;

    protected final String fuelType;

    protected final int maxGears;

    protected final double consumptionPer100km;

    protected int gear = 0;

    protected double totalKm;
    protected double fuelConsumed;

    protected double averageFuelConsumptionPerDrive;

    protected int currentGear;
    private double totalFuelConsumed;

    public Car(double availableFuel, String chassisNumber, int tireSize, double fuelTankSize, String fuelType, int maxGears, double consumptionPer100km) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = tireSize;
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.maxGears = maxGears;
        this.consumptionPer100km = consumptionPer100km;
    }

    protected void shiftGear(int gear) {
        System.out.println("Car shifted into gear: " + gear);
        if (gear > maxGears || gear < 0) {
            System.out.println("Invalid gear!");
            return;
        }
        calculateAverageFuelConsumptionPerTrip();
        System.out.println("Fuel consumed increasing or decreasing per gear shift " + averageFuelConsumptionPerDrive);
        currentGear = gear;

    }


    private void calculateAverageFuelConsumptionPerTrip() {
        if (this.currentGear < gear) {
            averageFuelConsumptionPerDrive = averageFuelConsumptionPerDrive * (1 + (gear - currentGear)) * 10 / 100;

        } else {
            averageFuelConsumptionPerDrive = averageFuelConsumptionPerDrive / (1 + (currentGear - gear)) * 10 / 100;
        }
    }


    @Override
    public void start() {
        System.out.println("Car started");
        averageFuelConsumptionPerDrive = 0;


    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
        System.out.println("Fuel consumed : " + totalFuelConsumed);
    }

    @Override
    public void drive(double km) {
        fuelConsumed = (consumptionPer100km * km) / 100;
        availableFuel += fuelConsumed;
        System.out.println("Remaining fuel: " + availableFuel);
        averageFuelConsumptionPerDrive = fuelConsumed * 100 / km;
        totalFuelConsumed += fuelConsumed;
        totalKm += km;
    }

    public double getAverageFuelConsumptionPerDrive() {
        averageFuelConsumptionPerDrive = totalFuelConsumed * 100 / totalKm;
        return averageFuelConsumptionPerDrive;
    }

    public double getAvailableFuel() {
        return availableFuel;
    }
}
