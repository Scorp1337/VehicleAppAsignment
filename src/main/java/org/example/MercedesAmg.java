package org.example;

public class MercedesAmg extends Mercedes implements  Vehicle{
    public MercedesAmg(double availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber, 17, 75, "PETROL", 6, 15);
    }
}
