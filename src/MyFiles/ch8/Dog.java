package MyFiles.ch8;

public class Dog extends Canine{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("Ruff!! ruff!!");
    }

    @Override
    public void move() {
        System.out.println("Moving here and there, wagging the tail all the way");
    }

    public void setName(String name) {
        this.name = name;
    }
}
