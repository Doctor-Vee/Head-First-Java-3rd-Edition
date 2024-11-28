package MyFiles.ch10;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello Chapter 10!");
        Animal.fly();
        Hippo hippo = new Hippo("Popo");
        hippo.eat();
        hippo.fly();
        Hippo.fly();

        Duck duck1 = new Duck("Pepeye");
        duck1.printNames();
        Duck duck2 = new Duck("Ducky");
        System.out.println(duck2.duckNames);
        Duck duck3 = new Duck("Duckling");
        System.out.println(Duck.duckCount);
        System.out.println(Duck.duckNames);
        duck3.getDuckNamesWithConstructor();

        // Singleton
        CaptainSingleton captainSingleton = CaptainSingleton.getInstance();
        CaptainSingleton captainSingleton1 = CaptainSingleton.getInstance();
        CaptainSingleton captainSingleton2 = CaptainSingleton.getInstance();

        System.out.println(CaptainSingleton.getNumberOfCreations());
        captainSingleton.sayHello();
        System.out.println(captainSingleton1.name);

        // Constants
        System.out.println(Constants.RADIUS);

        // Math methods
        int mathe = Math.abs(44);
        System.out.println(mathe);
        Random rand  = new Random();
        mathe = rand.nextInt();
        System.out.println(mathe);

        long z = Math.round(24.45);
        System.out.println(z);

        System.out.println(Math.min(21, 22.5559));
        System.out.println(Math.max(25, 220.5559));

        System.out.println(Math.sqrt(369.9));

        Integer man = new Integer(45);
        man++;
        System.out.println(man);

    }
}
