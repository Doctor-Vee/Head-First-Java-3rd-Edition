package MyFiles.ch8;

public abstract class Canine extends Animal{

    public Canine(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Eating flesh and veggies as an omnivore");
    }

    public abstract void bark();
}
