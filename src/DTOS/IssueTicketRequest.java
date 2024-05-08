package DTOS;

import Models.VehicleType;

public class IssueTicketRequest {
    String vehicleNumber;
    VehicleType type;
    String owner;
    Long gateId;

    public IssueTicketRequest(String vehicleNumber, VehicleType type, String owner, Long gateId) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.owner = owner;
        this.gateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
