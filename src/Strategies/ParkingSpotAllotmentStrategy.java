package Strategies;

import Exceptions.NoParkingSlotIsEmptyException;
import Models.ParkingLot;
import Models.ParkingSlot;
import Models.VehicleType;

public interface ParkingSpotAllotmentStrategy {
    public ParkingSlot getParkingSlot(VehicleType vehicleType, ParkingLot parkingLot) throws NoParkingSlotIsEmptyException;
}
