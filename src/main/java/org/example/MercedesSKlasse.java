package org.example;

public class MercedesSKlasse extends Mercedes implements  Vehicle{
    public MercedesSKlasse(double availableFuel, String chassisNumber, int tireSize, double fuelTankSize,
                           String fuelType, int maxGears, double consumptionPer100km) {
        super(availableFuel, chassisNumber, 16, 80, "DIESEL", 6, 10.5);
    }
}
