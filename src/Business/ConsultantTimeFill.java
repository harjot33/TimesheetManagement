package Business;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Harjot Singh
 */
public class ConsultantTimeFill {
  Map<DayOfWeek,Double> weekHours;
  private int consultID;

  public ConsultantTimeFill(int consultID){
    weekHours = new HashMap<>();
    this.consultID = consultID;
  }

  public boolean fillNewDayHours(DayOfWeek dayOfWeek, Double hours){
    if(weekHours.containsKey(dayOfWeek)){
      return false;
    }else{
      weekHours.put(dayOfWeek,hours);
      return true;
    }
  }

  public void fillExistingDayHours(DayOfWeek dayOfWeek, Double hours){
    weekHours.put(dayOfWeek,hours);
  }

  public Map<DayOfWeek,Double> giveTimeSheet(){
    return weekHours;
  }
}
