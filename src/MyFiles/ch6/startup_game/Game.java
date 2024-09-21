package MyFiles.ch6.startup_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Startup startup = new Startup();

        char headLetter = (char) ((int) (Math.random() * 5) + 65);
        int headNumber = (int) (Math.random() * 5);
        ArrayList<String> cells = new ArrayList<>();
        cells.add("" + headLetter + headNumber);
        cells.add("" + headLetter + (headNumber + 1));
        cells.add("" + headLetter + (headNumber + 2));
        startup.setLocationCells(cells);

//        boolean isAlive = true;
        int numOfGuesses = 0;

        while (true){
            System.out.print("Enter a cell from A0 to G6: ");
            String guess = scanner.next();
            numOfGuesses ++;
            String result = startup.checkYourself(guess);
            System.out.println(result);
            if(result.equals("kill")) break;
        }
        System.out.println("You used " + numOfGuesses + " guesses");
    }
}
