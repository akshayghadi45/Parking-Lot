package Models;

import Exceptions.NoParkingSlotIsEmptyException;
import Strategies.ParkingSpotAllotmentStrategy;

import java.util.List;

public class ParkingLot {
    private Long id;
    private List<Floor> floors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private ParkingSpotAllotmentStrategy parkingSpotAllotmentStrategy;


    public  ParkingSlot getParkingSLot(VehicleType type) throws NoParkingSlotIsEmptyException {
        return parkingSpotAllotmentStrategy.getParkingSlot(type,this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingLot(Long id, List<Floor> floors, List<Gate> gates, ParkingLotStatus parkingLotStatus, ParkingSpotAllotmentStrategy parkingSpotAllotmentStrategy) {
        this.id = id;
        this.floors = floors;
        this.gates = gates;
        this.parkingLotStatus = parkingLotStatus;
        this.parkingSpotAllotmentStrategy = parkingSpotAllotmentStrategy;
    }
}
