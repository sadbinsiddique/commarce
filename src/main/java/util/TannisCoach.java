package util;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Primary
public class TannisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley for 30 minutes";
    }
}
