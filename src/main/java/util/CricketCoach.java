package util;

import org.springframework.stereotype.Component;
import util.Coach;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes";
    }

}
