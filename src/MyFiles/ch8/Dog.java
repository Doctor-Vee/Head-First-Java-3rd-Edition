package MyFiles.ch8;

public class Dog extends Canine{

    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void bark() {
        System.out.println("Ruff!! ruff!!");
    }

    @Override
    public void move() {
        System.out.println("Moving here and there, wagging the tail all the way");
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
