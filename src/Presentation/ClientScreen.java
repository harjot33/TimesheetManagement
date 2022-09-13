package Presentation;

import Business.ClientTimeManager;
import Business.ConsultantTimeSubmit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Harjot Singh
 */
public class ClientScreen {

  public void showClientOptions(Scanner scanner,
                                ClientTimeManager clientTimeManager,
                                ConsultantTimeSubmit consultantTimeSubmit){
    while (true){
      System.out.println("1. View Pending TimeSheets.");
      System.out.println("2. View Approved TimeSheets.");
      System.out.println("3. Exit.");
      String input = scanner.nextLine();
      switch (input){
        case "1":
          if(clientTimeManager.getPendingList().size()==0){
            System.out.println("No Pending TimeSheets");
          }else{
            for(int id:clientTimeManager.getPendingList()){
              Double hours =
                  consultantTimeSubmit.getSubmittedTimeSheets().get(id);
              System.out.println("Client ID - "+id+" Hours - "+hours);}

            System.out.println("Enter the client ID whose timesheet you want " +
                "to approve;");
            int clientInput = scanner.nextInt();
            if(clientTimeManager.getPendingList().contains(clientInput)){
              clientTimeManager.removeFromPending(clientInput);
              clientTimeManager.addToApproved(clientInput);
              System.out.println("Successfully Approved");
            }else{
              System.out.println("Client ID doesn't exist");
            }
          }
          break;
        case "2":
          if(clientTimeManager.getApprovedList().size()==0){
            System.out.println("No Approved TimeSheets");
          }else{
            for(int id:clientTimeManager.getApprovedList()){
              Double hours =
                  consultantTimeSubmit.getSubmittedTimeSheets().get(id);
              System.out.println("Client ID - "+id+" Hours - "+hours);}
          }
          break;
        default:
          return;
      }
    }
  }
}
