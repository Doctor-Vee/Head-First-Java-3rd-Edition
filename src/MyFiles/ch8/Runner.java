package MyFiles.ch8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    //    ArrayList
    public static void main(String[] args) {
        Animal.greet();
        Animal hippo = new Hippo("Hippopotamus");
        System.out.println(hippo.name + " actions====================");
        hippo.eat();
        hippo.fly();

        System.out.println(hippo.getClass());
        System.out.println(hippo.hashCode());
        System.out.println(Integer.toHexString(hippo.hashCode()));

        Dog aja = new Dog("Aja");
        Dog nkita = new Dog("Nkita");
        Dog nkruma = new Dog("Nkruma");

        MyAnimalList<Animal> animalList = new MyAnimalList<>();

        System.out.println(animalList.size());

        animalList.add(aja);
        animalList.add(nkita);
        System.out.println(animalList);
        animalList.addAll(new Dog[]{nkruma, nkita});
        animalList.add(hippo);

        System.out.println(animalList);

        MyAnimalList<Animal> hippos = new MyAnimalList<>();
        hippos.add(hippo);
        hippos.add(aja);
        System.out.println(hippos);

        Object object = new Object();
        System.out.println(object);
        Object dog = new Dog("Dog");
        System.out.println(dog.hashCode());
        System.out.println("hello world");
        if (object instanceof Dog) {
            ((Dog) dog).eat();
        }
        System.out.println(dog.hashCode());
        System.out.println(nkita.hashCode());
        dog = getSameDog(aja);
        System.out.println(dog.hashCode());
        System.out.println(aja.hashCode());

        House house = new House();
        house.designEverywhere();


        Animal animal = new Animal("Animalia") {
            @Override
            public void eat() {
                System.out.println("Animal created from abstract class implementation is eating");
            }

            public void move() {
                System.out.println("Movement is not a bad idea here");
            }

        };

        animal.eat();
        animal.fly();
        animal.move();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(hippo);
        animals.add(nkita);
        animals.add(aja);
        animals.add(nkruma);
        System.out.println("Printing from the static method (testAnimalList)");
        testAnimalList(animals);

    }

    public static Animal getSameDog(Dog o) {
        return o;
    }


    static void testAnimalList(ArrayList<Animal> animals) {
        System.out.println(animals);
    }
}
