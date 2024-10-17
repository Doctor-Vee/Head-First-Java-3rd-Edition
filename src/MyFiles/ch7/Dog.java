package MyFiles.ch7;

public class Dog extends Animal{

    private int tailLength;
//    private boolean isDangerous = true;

    void sayHello(){
        super.isDangerous = true;
//        super.sayHello();
        System.out.println("I am a dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Woff!! Woff!!");
    }
}
