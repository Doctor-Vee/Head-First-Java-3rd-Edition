package MyFiles.ch7;

public class Chicken extends Animal{

    @Override
    public void sayHello(){
        System.out.println("It's a chicken");
    }

    @Override
    public void makeSound() {
        System.out.println("Kukuruuukuuuuu!!!");
    }

    public void fly(){
        System.out.println("I'm flyingg!!!");
    }
}
