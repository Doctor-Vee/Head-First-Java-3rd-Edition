package MyFiles.ch7;

public class Stringify {

    public static String convert(Animal animal) {
        animal.sayHello();
        animal.makeSound();
        return "This animal is dangerous: " + animal.isDangerous();
    }

    public static String convert(Dog animal) {
        animal.sayHello();
        animal.makeSound();
        return "This dog is dangerous: " + animal.isDangerous();
    }

    public static String convert(Chicken animal) {
        animal.sayHello();
        animal.makeSound();
        animal.fly();
        return "This chicken is dangerous: " + animal.isDangerous();
    }

    public static Number convert(int number){
        System.out.println("This is an integer");
//        number = number.intValue();
        return number;
    }
    public static String convert(Number number){
//        number = number.intValue();
        return String.valueOf(number);
    }



}
