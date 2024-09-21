package MyFiles.ch6.startup_game;

import java.util.ArrayList;
import java.util.List;

public class Startup {
    private String name;
    private List<String> locationCells = new ArrayList<>();
    private int numOfHits = 0;

    public Startup(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    String checkYourself(String guess) {
//        int index = locationCells.indexOf(guess);
//        System.out.println(index);
//        if (index >= 0) {

        if (locationCells.contains(guess)) {
            locationCells.remove(guess);
            numOfHits += 1;
            if (locationCells.isEmpty()) {
                return "kill";
            } else {
                return "hit";
            }
        }

        return "miss";
    }


    void setLocationCells(ArrayList<String> locationCells) {
//        for (int i = 0; i < loc.length; i++){
//            locationCells[i] = loc[i];
//        };
        this.locationCells = locationCells;
    }
}
