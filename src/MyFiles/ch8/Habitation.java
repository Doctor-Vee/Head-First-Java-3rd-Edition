package MyFiles.ch8;

public interface Habitation {

    public default void makeRoomsForVisitors(){
        System.out.println("Make rooms available for visitors");
    }

    public default void designEverywhere(){
        System.out.println("Everywhere is designed in Habitation");
    };

    String makeBedsAvailable();
}
