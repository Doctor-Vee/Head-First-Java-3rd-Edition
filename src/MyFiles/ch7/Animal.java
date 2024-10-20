package MyFiles.ch7;

public abstract class Animal {
    private String picture = "Animal picture";
    private int hunger;
    boolean isDangerous = false;

    public void sayHello(){
        System.out.println("I am here to do animal stuff");
        System.out.println(picture);
    }

    public void makeSound(){
        System.out.println("I'm making sound");
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public static int giveHeight(){
        return 45;
    }
}
