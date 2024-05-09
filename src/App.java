import Controllers.TicketController;
import DTOS.IssueTicketRequest;
import DTOS.IssueTicketRespose;
import Models.*;
import Repositories.GateRepository;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicleRepository;
import Services.TicketService;
import Strategies.FirstEmptySlotAllotmentStrategy;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        System.out.println("Parking lot");

        Gate gate = new Gate(GateType.ENTRY_GATE,1l, GateStatus.OPERATIONAL);

        Floor floor1 = new Floor(1);
        ArrayList<ParkingSlot> parkingSlotList = new ArrayList<ParkingSlot>();
        for(int i=0;i<10;i++){
            parkingSlotList.add(new ParkingSlot(VehicleType.CAR,ParkingSlotStatus.EMPTY,i,floor1));
        }
        floor1.setParkingSlotList(parkingSlotList);
        ArrayList<Floor> floors = new ArrayList<Floor>();
        floors.add(floor1);
        ArrayList<Gate> gates = new ArrayList<Gate>();
        gates.add(gate);
        ParkingLot parkingLot1 = new ParkingLot(1l,floors,gates,ParkingLotStatus.ACTIVE, new FirstEmptySlotAllotmentStrategy());

        //Repositories
        GateRepository gateRepository = new GateRepository();
        gateRepository.getGateTable().put(1l,gate);

        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.getParkingLotTable().put(1l,parkingLot1);

        TicketRepository ticketRepository = new TicketRepository();
        TicketService ticketService = new TicketService(vehicleRepository,gateRepository,parkingLotRepository,ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequest issueTicketRequest = new IssueTicketRequest("GA-04-j-1293",VehicleType.CAR,"AK",1l);
        IssueTicketRespose issueTicketRespose = ticketController.issueTicket(issueTicketRequest);
        System.out.println(issueTicketRespose.getMessage()+" "+ issueTicketRespose.getTicket().getTicketNumber()+" "+
                issueTicketRespose.getTicket().getVehicle().getVehicleNumber());

    }
}
