package Repositories;

import Exceptions.GateNotFounfException;
import Models.Gate;
import Models.GateStatus;
import Models.GateType;
import Models.Operator;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Long,Gate> gateTable = new HashMap<Long,Gate>();
    public Gate getGateById(long gateId) throws GateNotFounfException {
        if(gateTable.containsKey(gateId)){
            return gateTable.get(gateId);
        }else{
            throw new GateNotFounfException();
        }
    }

    public Map<Long, Gate> getGateTable() {
        return gateTable;
    }

    public Gate setGate(Long gateId, GateType gateType, GateStatus gateStatus){
        Gate gate = new Gate(gateType,gateId,gateStatus);
        gateTable.put(gateId,gate);
        return gateTable.get(gateId);
    }
}
