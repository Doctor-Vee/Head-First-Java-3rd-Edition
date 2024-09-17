package MyFiles.ch5.startup_game;

import java.util.Arrays;

public class Startup {

    private int [] locationCells = new int[3];
    private int numOfHits = 0;

    String checkYourself (int guess){
        if(Arrays.stream(locationCells).anyMatch(value -> value == guess)){
            numOfHits += 1;
            if(numOfHits == locationCells.length){
                return "kill";
            } else {
                return "hit";
            }
        } else {
            return "miss";
        }
    }

    void setLocationCells(int [] loc){
//        for (int i = 0; i < loc.length; i++){
//            locationCells[i] = loc[i];
//        };
        locationCells = loc;
    }
}
