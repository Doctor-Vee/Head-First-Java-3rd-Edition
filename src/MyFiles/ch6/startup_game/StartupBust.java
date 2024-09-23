package MyFiles.ch6.startup_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartupBust {
    GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<>();
    private int numOfGuesses = 0;

    void setUpGame() {
        Startup poniez = new Startup("Poniez");
        Startup cabista = new Startup("Cabista");
        Startup hacqi = new Startup("Hacqi");

        startups.addAll(Arrays.asList(poniez, cabista, hacqi));

        System.out.println("This is a game where you can sink startups by guessing their locations... \n" +
                "You are expected to sink 3 startups (poniez, cabista and hacqi)... Are you ready?? 🥳");

        for (Startup startup : startups) {
            helper.placeStartup(startup);
        }
    }

    void startPlaying() {
        while (!startups.isEmpty()) {
            String guess = helper.takeUserGuess("Enter a cell from A0 to G6: ");
            checkUserGuess(guess);
        }
        finishGame();
    }

    private void checkUserGuess(String guess) {
        numOfGuesses++;
        String result = "miss";

//        for(int i = 0; i < startups.size(); i++){
//            result = startups.get(i).checkYourself(guess);
//            System.out.println(result);
//            if(result.equals("kill")){
//                System.out.println("You sank " + startups.get(i).getName());
//                startups.remove(i); //TODO: Decide whether to follow them or to leave it like this
//            }
//        }

        for (Startup startup: startups){
            result = startup.checkYourself(guess);

            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")) {
                startups.remove(startup);
                break;
            }
        }
        System.out.println(result);
    }

    void finishGame() {
        System.out.println("The Game is over 🎉You used " + numOfGuesses + " guesses");

        if(numOfGuesses < 17){
            System.out.println("You did an excellent job! ✅ ");
        } else {
            System.out.println("Gerrarahere mehn ... Go and learn biko 😏");
        }
    }

    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();

    }
}
