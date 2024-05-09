package Services;

import Exceptions.GateNotFounfException;
import Exceptions.NoParkingSlotIsEmptyException;
import Exceptions.ParkingLotNotFounfException;
import Models.*;
import Repositories.GateRepository;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicleRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public class TicketService {
    private VehicleRepository vehicleRepository;
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(VehicleRepository vehicleRepository, GateRepository gateRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.vehicleRepository = vehicleRepository;
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String vehicleNumber, VehicleType type, String owner , long gateId) throws GateNotFounfException, ParkingLotNotFounfException, NoParkingSlotIsEmptyException {
        //create an enpty ticket
        //set time
        //fetch vehicle if available else create and set vehicle
        //get parking lot-> get floor -> get parking spot
        //generate ticket number
        //save and return ticket


        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());

        Vehicle vehicle = vehicleRepository.getVehicleByNumber(vehicleNumber);

        if(vehicle==null){
            vehicle = vehicleRepository.addVehicle(vehicleNumber,owner,type);
        }


        Gate gate = gateRepository.getGateById(gateId);
        ticket.setGate(gate);
        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGateId(1l);
        ParkingSlot parkingSlot = parkingLot.getParkingSLot(type);
        ticket.setParkingSlot(parkingSlot);
        ticket.setTicketNumber(vehicleNumber+ UUID.randomUUID());
        ticket.setVehicle(vehicle);
        ticketRepository.createTicket(ticket);
        return  ticket;

    }
}
