package Models;

public class Gate {
    private GateType gateType;
    private Long gateNumber;
    private Operator operator;
    private GateStatus gateStatus;


    public Gate(GateType gateType, Long gateNumber, GateStatus gateStatus) {
        this.gateType = gateType;
        this.gateNumber = gateNumber;
        this.gateStatus = gateStatus;

    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Long getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(Long gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
