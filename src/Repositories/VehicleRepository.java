package Repositories;

import Models.Vehicle;
import Models.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    Map<String, Vehicle> vehicleTable = new HashMap<String, Vehicle>();

    public  Vehicle getVehicleByNumber(String vehicleNumber) {
        return vehicleTable.get(vehicleNumber);
    }

    public Vehicle addVehicle(String vehicleNumber, String owner, VehicleType vehicleType){
        Vehicle vehicle = new Vehicle(vehicleNumber,vehicleType,owner);
        vehicleTable.put(vehicleNumber,vehicle);
        return vehicleTable.get(vehicleNumber);
    }

}
