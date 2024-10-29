package MyFiles.ch9;

public class Duck {
    private int size;

    public Duck(){
        System.out.println("Creating the duck and setting the size by default to 50");
        size = 50;
    }

    public Duck(int size){
        System.out.println("Creating the duck and setting the size to " + size);
        this.size = size;
    }

    public Duck(int size, int height){
        System.out.println("Creating the duck and setting the size to " + size);
        this.size = size;
    }

//    public Duck(int height, int weight){
//        System.out.println("Creating the duck and setting the size to " + size);
//        this.size = size;
//    }

    public int getSize() {
        return size;
    }
}
