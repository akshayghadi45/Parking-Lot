package Repositories;

import Exceptions.ParkingLotNotFounfException;
import Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long,ParkingLot> parkingLotTable = new HashMap<Long,ParkingLot>();
    public ParkingLot getParkingLotByGateId(long parkingLotId) throws ParkingLotNotFounfException {
        if(parkingLotTable.containsKey(parkingLotId)){
            return parkingLotTable.get(parkingLotId);
        }
        throw new ParkingLotNotFounfException();
    }

    public Map<Long, ParkingLot> getParkingLotTable() {
        return parkingLotTable;
    }

    public void setParkingLotMap(Map<Long,ParkingLot> parkingLotMap){
        parkingLotTable=parkingLotMap;
    }
}
