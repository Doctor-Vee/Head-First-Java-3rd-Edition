package MyFiles.ch6.startup_game;

public class StartupBust {
    GameHelper helper = new GameHelper();
    Startup[] startups = new Startup[3];
    int numOfGuesses = 0;

    void setUpGame() {
        startups[0] = new Startup("Poniez");
        startups[1] = new Startup("Cabista");
        startups[2] = new Startup("Hacqi");

        helper.setStartupLocationCells(startups[0]);
        helper.setStartupLocationCells(startups[1]);
        helper.setStartupLocationCells(startups[2]);

        System.out.println("This is a game where you can shoot down startups by guessing their locations... Are you ready?? 🥳");
    }

    void startPlaying(){

    }


    public static void main(String[] args) {


        int liveStartups = 3;

        do {
            String guess = helper.takeUserGuess("Enter a cell from A0 to G6: ");
            numOfGuesses++;
            String result0 = startups[0].checkYourself(guess);
            String result1 = startups[1].checkYourself(guess);
            String result2 = startups[2].checkYourself(guess);

            if (result0.equals("kill") || result1.equals("kill") || result2.equals("kill")) {
                System.out.println("kill");
                liveStartups--;
            } else if (result0.equals("hit") || result1.equals("hit") || result2.equals("hit")) {
                System.out.println("hit");
            } else {
                System.out.println("miss");
            }
        } while (liveStartups != 0);
        System.out.println("You used " + numOfGuesses + " guesses");
    }
}
