package Presentation;

import Business.ClientTimeManager;
import Business.ConsultantTimeFill;
import Business.ConsultantTimeSubmit;
import Dummy.DummyClient;
import Dummy.DummyConsultant;

import java.util.Scanner;

/**
 * @author Harjot Singh
 */
public class TimeSheetAppEntry {

  public static void main(String[] args) {

    DummyClient dummyClient = new DummyClient(133,"Test");
    DummyConsultant dummyConsultant = new DummyConsultant(2335,"15","Test");
    ClientTimeManager clientTimeManager = new ClientTimeManager();
    ConsultantTimeSubmit consultantTimeSubmit = new ConsultantTimeSubmit();
    ConsultantTimeFill consultantTimeFill =
        new ConsultantTimeFill(dummyConsultant.getConsID());

    final Scanner scanner = new Scanner(System.in);
    System.out.print("Welcome to TimeSheet Management System\n" +
        "" +
        "Select an option to begin with\n");

    while (true) {
      System.out.println("1. Consultant Screen");
      System.out.println("2. Client Screen");
      System.out.println("3. Exit.");
      System.out.println("Select an option:");
      final String input = scanner.nextLine();

      switch (input) {
        case "1":
        ConsultantScreen consultantScreen = new ConsultantScreen();
        consultantScreen.showConsultantOptions(dummyConsultant.getConsID(),scanner,
            consultantTimeFill,
            consultantTimeSubmit);
        consultantTimeSubmit.addToPending(dummyConsultant.getConsID(),clientTimeManager);
          break;
        case "2":
          ClientScreen clientScreen = new ClientScreen();
          clientScreen.showClientOptions(scanner, clientTimeManager,
              consultantTimeSubmit);
          break;
        case "8":
          System.exit(0);
        default:
          break;
      }
    }



  }
}
