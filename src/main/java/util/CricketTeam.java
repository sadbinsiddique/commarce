package util;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketTeam implements Team {

    public CricketTeam() {
        System.out.println("In constructor:  " + this.getClass().getSimpleName());
    }

    @Override
    public String getName() {
        return "Bangladesh Cricket Team";
    }
}
