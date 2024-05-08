package Controllers;

import DTOS.IssueTicketRequest;
import DTOS.IssueTicketRespose;
import DTOS.ResponseStatus;
import Exceptions.GateNotFounfException;
import Exceptions.NoParkingSlotIsEmptyException;
import Exceptions.ParkingLotNotFounfException;
import Models.Ticket;
import Services.TicketService;

public class TicketController {
    TicketService ticketService;

    IssueTicketRespose issueTicket(IssueTicketRequest issueTicketRequest){
        Ticket ticket = null;
        IssueTicketRespose issueTicketRespose = new IssueTicketRespose();
        try{
            ticket =ticketService.issueTicket(issueTicketRequest.getVehicleNumber(),issueTicketRequest.getType(),
                    issueTicketRequest.getOwner(),issueTicketRequest.getGateId());
            issueTicketRespose.setTicket(ticket);
            issueTicketRespose.setMessage("Ticket generation success");
            issueTicketRespose.setResponseStatus(ResponseStatus.SUCCESS);


        }catch(ParkingLotNotFounfException e){
            System.out.println("Parking Lot not found"+ e.getMessage());
            issueTicketRespose.setTicket(null);
            issueTicketRespose.setMessage(e.getMessage());
            issueTicketRespose.setResponseStatus(ResponseStatus.FAILED);
        }
        catch (GateNotFounfException e) {
            System.out.println("Gate not found"+ e.getMessage());
            issueTicketRespose.setTicket(null);
            issueTicketRespose.setMessage(e.getMessage());
            issueTicketRespose.setResponseStatus(ResponseStatus.FAILED);

        }catch(Exception e){
            System.out.println("Exceptioni occured "+e.getMessage());
            issueTicketRespose.setTicket(null);
            issueTicketRespose.setMessage(e.getMessage());
            issueTicketRespose.setResponseStatus(ResponseStatus.FAILED);
        }


        return null;
    }
}
