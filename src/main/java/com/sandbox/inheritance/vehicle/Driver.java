package com.sandbox.inheritance.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Driver {


    public static void main(String[] args) {
       /* LandCraft car = new Car();
        car.startEngine();

        displayVehicle(car);
        //displayVehicle(truck);

        LandCraft truck = new Truck();
        truck.startEngine();

        displayVehicle(car);
        displayVehicle(truck);

        truck.stopEngine();

        displayVehicle(car);
        displayVehicle(truck);

        System.out.println("Vehicle counter: " + Vehicle.counter);

        car.transport();
        truck.transport();*/

        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());  // anonymous instantiation
            vehicles.add(new Truck());
          }

        for(Vehicle v : vehicles) {
            v.startEngine();
            displayVehicle(v);
            v.stopEngine();
            displayVehicle(v);
            if(v instanceof Truck) {
                ((Truck) v).horn();
            }
        }


    }

    private static void displayVehicle(Vehicle vehicle) {
        System.out.println(vehicle.engineStarted);

    }
}
