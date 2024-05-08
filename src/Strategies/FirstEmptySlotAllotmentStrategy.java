package Strategies;

import Exceptions.NoParkingSlotIsEmptyException;
import Models.*;

public class FirstEmptySlotAllotmentStrategy implements ParkingSpotAllotmentStrategy{
    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, ParkingLot parkingLot) throws NoParkingSlotIsEmptyException {

        for(Floor floor: parkingLot.getFloors()){
            for(ParkingSlot parkingSlot: floor.getParkingSlotList()){
                if(parkingSlot.getParkingsSlotStatus().equals(ParkingSlotStatus.EMPTY)){
                    return  parkingSlot;
                }
            }
        }
        throw new NoParkingSlotIsEmptyException();
    }
}
