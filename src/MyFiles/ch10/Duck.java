package MyFiles.ch10;

public class Duck {
    public static int duckCount;
    private int size;

    public Duck() {
        duckCount++;
        System.out.println("Creating duck. Duck count is " + duckCount);
    }

    public int getSize(){
        return size;
    }
}
