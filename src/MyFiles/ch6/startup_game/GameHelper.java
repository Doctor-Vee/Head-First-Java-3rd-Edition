package MyFiles.ch6.startup_game;

import java.util.ArrayList;
import java.util.Scanner;

public class GameHelper {
    Scanner scanner = new Scanner(System.in);


    public String takeUserGuess(String display){
        System.out.print(display);
        return scanner.next();
    }

    public void setStartupLocationCells(Startup startup){
        char headLetter = (char) ((int) (Math.random() * 5) + 65);
        int headNumber = (int) (Math.random() * 5);
        ArrayList<String> cells = new ArrayList<>();
        cells.add("" + headLetter + headNumber);
        cells.add("" + headLetter + (headNumber + 1));
        cells.add("" + headLetter + (headNumber + 2));
        startup.setLocationCells(cells);
    }

}
