package MyFiles.ch8;

public interface Aesthetics {

    void getProperLighting();

    default void designEverywhere(){
        System.out.println("Everywhere is designed in aesthetics");
    };
}
