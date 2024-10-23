package MyFiles.ch8;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();

    public void fly(){
        System.out.println("Animal is flying");
    }

    public static void greet(){
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void move();
}
