package MyFiles.ch10;

public class Constants {

    public final static int RADIUS; // static final variables are constants

    // Static initializer - This runs when a class is loaded before any other code can use the class
    static {
        RADIUS = 5;
    }
}
