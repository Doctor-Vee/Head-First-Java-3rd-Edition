package MyFiles.ch10;

public class Hippo extends Animal {

    public Hippo(String name) {
        super(name);
    }

    public void eat() {
        super.fly();
        System.out.println("Hippo is eating");
    }

//    @Override
//    public void fly() {
//        System.out.println("Hippo cannot fly biko");
//    }

    @Override
    public void move() {
        System.out.println("Hippo moves");
    }
}
