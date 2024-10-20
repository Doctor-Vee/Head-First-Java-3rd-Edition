package MyFiles.ch8;

public abstract class Animal {

    public abstract void eat();

    public void fly(){
        System.out.println("Animal is flying");
    }

    public static void greet(){
        System.out.println("Hello");
    }

    public abstract void move();
}
