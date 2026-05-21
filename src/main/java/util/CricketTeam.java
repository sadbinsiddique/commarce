package util;

import org.springframework.stereotype.Component;

@Component
public class CricketTeam implements Team {

    @Override
    public String getName() {
        return "Bangladesh Cricket Team";
    }
}
