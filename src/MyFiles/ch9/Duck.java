package MyFiles.ch9;

public class Duck {
    protected int size;

    private Duck(){
        System.out.println("Creating the duck and setting the size by default to 50");
        size = 50;
    }

    public Duck(boolean defaultConstructor){
       this();
        System.out.println("Increasing the size by 10 in the Duck class");
       this.size += 10;
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
