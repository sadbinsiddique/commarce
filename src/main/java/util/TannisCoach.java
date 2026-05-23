package util;

import org.springframework.stereotype.Component;

@Component
public class TannisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley for 30 minutes";
    }
}
