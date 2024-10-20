package MyFiles.ch8;

public class Hippo extends Animal{

    public void eat() {
        System.out.println("Hippo is eating");
    }

    @Override
    public void fly() {
        System.out.println("Hippo cannot fly biko");
    }

    @Override
    public void move() {
        System.out.println("Hippo moves");
    }
}
