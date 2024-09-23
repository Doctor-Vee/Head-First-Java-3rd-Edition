package MyFiles.ch6.startup_game;

import java.util.ArrayList;
import java.util.List;

public class Startup {
    private String name;
    private List<String> locationCells = new ArrayList<>();

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
        String result = "miss";
        if (locationCells.contains(guess)) {
            locationCells.remove(guess);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name);
            } else {
                result = "hit";
            }
        }

        return result;
    }


    void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }
}
