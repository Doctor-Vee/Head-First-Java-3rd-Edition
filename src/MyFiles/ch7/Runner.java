package MyFiles.ch7;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello Doctor Vee!");

        Animal animal = new Chicken();
//        animal.sayHello();
        System.out.println(animal.isDangerous());
        Dog dog = new Dog();
//        dog.sayHello();
        System.out.println(dog.isDangerous());

        Animal[] animals = new Animal[3];

        animals[0] = new Chicken();
        animals[1] = new Dog();
        animals[2] = new Animal() {
        };

        for (Animal animalia : animals) {
            System.out.println("This animal is saying hello: ");
            animalia.sayHello();
        }
        System.out.println("=--------------------------=");
        System.out.println(Stringify.convert(animal));
        System.out.println(Stringify.convert(dog));
        System.out.println(Stringify.convert(animals[2]));
        System.out.println(Stringify.convert(new Chicken()));
        System.out.println(Stringify.convert(55));
        System.out.println(Stringify.convert(55L));
        System.out.println(Stringify.convert(55.55));
    }
}