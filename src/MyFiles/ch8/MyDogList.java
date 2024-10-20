package MyFiles.ch8;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class MyDogList {

    private final Dog[] dogList = new Dog[5];
    private int index;

    public void add(Dog dog){
        if(index < 5){
            dogList[index] = dog;
            index++;
        }
    }

    public void addAll(Dog[] dogs){
        for(Dog dog : dogs){
            add(dog);
        }
    }

    public Dog get(int index){
        return dogList[index];
    }

    public int size(){
        return index;
    }

    @Override
    public String toString() {
        return "MyDogList{" +
                "dogList=" + Arrays.toString(Arrays.stream(dogList).filter(Objects::nonNull).toArray()) +
                ", index=" + index +
                '}';
    }
}
