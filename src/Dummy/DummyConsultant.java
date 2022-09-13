package Dummy;

/**
 * @author Harjot Singh
 */
public class DummyConsultant {
  //Unique Id of consultant
  private final int consultID;

  //Password of consultant
  private final String password;

  //PayRate of Consultant
  private final String payRate;

  private final String userCode = "USER";

  /**
   *
   * @param consultID   Unique Id of Consultant
   * @param payRate     Email of consultant
   * @param password  Password of consultant
   */
  public DummyConsultant(  final int consultID,
                      final String payRate,
                      final String password) {
    this.consultID = consultID;
    this.password = password;
    this.payRate = payRate;
  }



  /**
   * Gets an email of the consultant
   *
   * @return an email of the consultant
   */
  public int getConsID() {
    return consultID;
  }

  public String getPassword() {
    return password;
  }

  public String getCode() {
    return userCode;
  }

  public String getPayRate() {
    return payRate;
  }

  public String getUserCode(){ return userCode;}
}
