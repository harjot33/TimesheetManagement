package Business;

/**
 * @author Harjot Singh
 */
public class HoursVerification {

  public static boolean hoursVerify(Double hours){
    return hours > 0 && hours <= 24;
  }
}
