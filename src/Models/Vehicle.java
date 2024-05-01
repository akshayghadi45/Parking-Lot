package Models;

public class Vehicle {
    private String VehicleNumber;
    private VehicleType vehicleType;
    private String owner;

    public Vehicle(String vehicleNumber, VehicleType vehicleType, String owner) {
        VehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.owner = owner;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
