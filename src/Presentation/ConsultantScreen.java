package Presentation;

import Business.ConsultantTimeFill;
import Business.ConsultantTimeSubmit;
import Business.HoursVerification;

import java.time.DayOfWeek;
import java.util.Scanner;

/**
 * @author Harjot Singh
 */
public class ConsultantScreen {

  public void showConsultantOptions(int consultantID, Scanner scanner,
                                    ConsultantTimeFill consultantTimeFill,
                                    ConsultantTimeSubmit consultantTimeSubmit){
      System.out.println("1. Submit Weekly TimeSheet");
      System.out.println("2. Exit to Main Screen");
      String input = scanner.nextLine();
      if (input.equals("1")) {
        for (DayOfWeek day : DayOfWeek.values()) {
          System.out.println("Enter hours for " + day);
          Double hours = scanner.nextDouble();
          while(!HoursVerification.hoursVerify(hours)){
            System.out.println("Hours cannot be less than 0 and more than 24," +
                " please enter the hours again");
            hours = scanner.nextDouble();
          }
          boolean value = consultantTimeFill.fillNewDayHours(day, hours);
          if (value) {
            System.out.println("Successfully Entered Day Hours");
          } else {
            System.out.println("The hours for this day have already been " +
                "entered, please enter the new hours for this day.");
            consultantTimeFill.fillExistingDayHours(day, hours);
          }
        }
        System.out.println("You have entered hours for all the days in the " +
            "week, now the timesheet will get submitted");
        consultantTimeSubmit.timeSheetSubmission(consultantTimeFill.giveTimeSheet(),consultantID);
      }

  }
}
