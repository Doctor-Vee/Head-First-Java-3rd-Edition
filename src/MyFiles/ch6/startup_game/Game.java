package MyFiles.ch6.startup_game;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Startup startup = new Startup();

        int head = (int) (Math.random() * 5) ;
        startup.setLocationCells(Arrays.asList(head, head + 1, head + 2));

//        boolean isAlive = true;
        int guess = 0;

        while (true){
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            guess ++;
            String result = startup.checkYourself(num);
            System.out.println(result);
            if(result.equals("kill")) break;
        }
        System.out.println("You used " + guess + " guesses");
    }
}
