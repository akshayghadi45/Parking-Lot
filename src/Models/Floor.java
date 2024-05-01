package Models;

import java.util.List;

public class Floor {
    private int floorNumber;
    private List<ParkingSlot> parkingSlotList;

    public Floor(int floorNumber, List<ParkingSlot> parkingSlotList) {
        this.floorNumber = floorNumber;
        this.parkingSlotList = parkingSlotList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }
}
