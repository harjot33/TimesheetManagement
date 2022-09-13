package Business;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Harjot Singh
 */
public class ConsultantTimeSubmit {
  private final HashMap<Integer, Double> consTimeSubmission;

  public ConsultantTimeSubmit(){
    consTimeSubmission = new HashMap<>();
  }

  public void timeSheetSubmission(Map<DayOfWeek,Double> consultantHours,
                                  int consultID){
    double hours = 0.0;
    for(DayOfWeek dayOfWeek:consultantHours.keySet()){
      Double dayHours = consultantHours.get(dayOfWeek);
      hours = hours + dayHours;
    }
    consTimeSubmission.put(consultID,hours);
  }

  public HashMap<Integer,Double> getSubmittedTimeSheets(){
    return  consTimeSubmission;
  }
  public void addToPending(int consultID, ClientTimeManager clientTimeManager){
    clientTimeManager.addToPending(consultID);
  }
}
