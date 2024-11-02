package MyFiles.ch10;

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
        duck3.printNames();

        CaptainSingleton captainSingleton = CaptainSingleton.getInstance();
        CaptainSingleton captainSingleton1 = CaptainSingleton.getInstance();
        CaptainSingleton captainSingleton2 = CaptainSingleton.getInstance();

        System.out.println(CaptainSingleton.getNumberOfCreations());
        captainSingleton.sayHello();
        System.out.println(captainSingleton1.name);

        System.out.println(Constants.radius);
    }
}
