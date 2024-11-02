package MyFiles.ch10;

public class Constants {

    public final static int radius; // static final variables are constants

    // Static initializer - This runs when a class is loaded before any other code can use the class
    static {
        radius = 5;
    }
}
