package MyFiles.ch10;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello Chapter 10!");
        Animal.fly();
        Hippo hippo = new Hippo("Popo");
        hippo.eat();
        hippo.fly();
        Hippo.fly();

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Duck duck3 = new Duck();

        System.out.println(Duck.duckCount);
    }
}
