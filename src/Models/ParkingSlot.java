package Models;

public class ParkingSlot {
    private VehicleType vehicleType;
    private ParkingSlotStatus parkingsSlotStatus;
    private int slotNumber;
    private Floor floor;

    public ParkingSlot(VehicleType vehicleType, ParkingSlotStatus parkingsSlotStatus, int slotNumber, Floor floor) {
        this.vehicleType = vehicleType;
        this.parkingsSlotStatus = parkingsSlotStatus;
        this.slotNumber = slotNumber;
        this.floor = floor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSlotStatus getParkingsSlotStatus() {
        return parkingsSlotStatus;
    }

    public void setParkingsSlotStatus(ParkingSlotStatus parkingsSlotStatus) {
        this.parkingsSlotStatus = parkingsSlotStatus;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
