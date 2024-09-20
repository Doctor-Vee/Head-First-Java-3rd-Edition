package MyFiles.ch5.startup_game;

import java.util.Arrays;

public class Startup {

    private int [] locationCells = new int[3];
    private int numOfHits = 0;

    String checkYourself (int guess){
        for(int i = 0; i < locationCells.length; i++){
            if(locationCells[i] == guess){
                numOfHits += 1;
                if(numOfHits == locationCells.length){
                    return "kill";
                } else {
                    return "hit";
                }
            }
        }
        return "miss";
        }


    void setLocationCells(int [] loc){
//        for (int i = 0; i < loc.length; i++){
//            locationCells[i] = loc[i];
//        };
        locationCells = loc;
    }
}
