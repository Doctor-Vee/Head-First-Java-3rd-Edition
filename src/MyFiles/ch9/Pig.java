package MyFiles.ch9;

public class Pig {
    private int height;

    public Pig(){
        System.out.println("Creating a new pig and setting the height to a default value of 10");
        this.height += 10;
    }

    public Pig(int height){
        System.out.println("Creating a new pig and setting the height to the given value of " + height);
        this.height = height;
    }

    public int getHeight() {
        return height += 10;
    }
}
