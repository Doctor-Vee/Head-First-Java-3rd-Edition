package MyFiles.ch8;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

//    ArrayList
    public static void main(String[] args) {
        Animal.greet();
        Animal hippo = new Hippo();
        hippo.eat();
        hippo.fly();

        Dog aja = new Dog("Aja");
        Dog nkita = new Dog("Nkita");
        Dog nkruma = new Dog("Nkruma");

        MyDogList dogList = new MyDogList();

        System.out.println(dogList.size());

        dogList.add(aja);
        dogList.add(nkita);
        System.out.println(dogList);
        dogList.addAll(new Dog[]{aja, nkita, nkruma});

        System.out.println(dogList);
    }
}
