package Business;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Harjot Singh
 */
public class ClientTimeManager {
  private final ArrayList<Integer> pendingConsultantTS;
  private final ArrayList<Integer> approvedConsultanTS;

  public ClientTimeManager(){
    pendingConsultantTS = new ArrayList<>();
    approvedConsultanTS = new ArrayList<>();
  }

  public void addToPending(int consultID){
    pendingConsultantTS.add(consultID);
  }

  public void removeFromPending(int consultID){
    pendingConsultantTS.remove(Integer.valueOf(consultID));
  }

  public void addToApproved(int consultID){
    approvedConsultanTS.add(consultID);
  }

  public void removeFromApproved(int consultID){
    approvedConsultanTS.remove(consultID);
  }

  public ArrayList<Integer> getPendingList(){
    return pendingConsultantTS;
  }

  public ArrayList<Integer> getApprovedList(){
    return approvedConsultanTS;
  }
}
