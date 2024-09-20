package MyFiles.ch6.startup_game;

import java.util.ArrayList;
import java.util.List;

public class Startup {

    private List<Integer> locationCells = new ArrayList<>();
    private int numOfHits = 0;

    String checkYourself(int guess) {
        int index = locationCells.indexOf(guess);
        System.out.println(index);
        if (index >= 0) {
            locationCells.remove(index);
            numOfHits += 1;
            if (locationCells.isEmpty()) {
                return "kill";
            } else {
                return "hit";
            }
        }

        return "miss";
    }


    void setLocationCells(List<Integer> locationCells) {
//        for (int i = 0; i < loc.length; i++){
//            locationCells[i] = loc[i];
//        };
        this.locationCells = locationCells;
    }
}
