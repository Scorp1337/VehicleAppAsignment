package org.example;

/**
 * vehicles -> interface -> they start, stop and drive
 * Car has 2 models Audi and Mercedes that have 2 models of their own : Audi A6 / Audi rs8 / MercedesAMG /
 * Merdedes SKlasse
 * final properties for Car : fuelTankSize fuelType maxGears consumptionPer100km
 * configurable prop: availableFuel, tireSize
 * instance specific prop: chassisNumber

 */
public class App 
{
    public static void main( String[] args )
    {
//
//        Car car = new Car(); // this should not compile.
//
//        Car car = new AudiA6(27, "A"); // this should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.

        Car car = new AudiA6(30.5,"A6Z111333"); // Logan can extend from Dacia, while Dacia extends from Car

        car.start();

        car.shiftGear(1);

        car.drive(0.01); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

        double availableFuel = car.getAvailableFuel();
        System.out.println("Available fuel " + availableFuel);

        double fuelConsumedPer100Km = car.getAverageFuelConsumptionPerDrive();
        System.out.println("Fuel consumed per 100 km: " + fuelConsumedPer100Km);



        Vehicle vehicle = new AudiRs8(44, "ARS8Z999555"); // available fuel and chassis number

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car car2 = (Car) vehicle;

         availableFuel = car.getAvailableFuel();

         fuelConsumedPer100Km = car.getAverageFuelConsumptionPerDrive();
    }
}
