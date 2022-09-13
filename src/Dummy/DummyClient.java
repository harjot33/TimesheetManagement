package Dummy;

/**
 * @author Harjot Singh
 */
public class DummyClient {
  //Unique Id of client
  private final int consultID;

  //Password of client
  private final String password;

  /**
   *
   * @param clientID   Unique Id of client
   * @param password  Password of client
   */
  public DummyClient(  final int clientID,
                           final String password) {
    this.consultID = clientID;
    this.password = password;
  }

  public int getConsID() {
    return consultID;
  }

  public String getPassword() {
    return password;
  }

}
