package org.example;

public abstract class Audi extends Car implements Vehicle{
    public Audi(double availableFuel, String chassisNumber, int tireSize, double fuelTankSize, String fuelType,
                int maxGears, double consumptionPer100km) {
        super(availableFuel, chassisNumber, tireSize, fuelTankSize, fuelType, maxGears, consumptionPer100km);
    }
}
