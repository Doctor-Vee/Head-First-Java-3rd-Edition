package MyFiles.ch7;

public class Dog extends Canine{

    private int tailLength;
//    private boolean isDangerous = true;

    public void sayHello(){
        super.isDangerous = true;
//        super.sayHello();
        System.out.println("I am a dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Woff!! Woff!!");
    }
}
