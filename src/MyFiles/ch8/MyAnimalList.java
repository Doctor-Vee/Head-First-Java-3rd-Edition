package MyFiles.ch8;

import java.util.Arrays;
import java.util.Objects;

public class MyAnimalList<E> {

    @SuppressWarnings("unchecked")
    private final E[] animalList = (E[]) new Object[5];
    private int index;

    public void add(E animal){
        if(index < 5){
            animalList[index] = animal;
            index++;
        }
    }

    public void addAll(E[] animals){
        for(E animal : animals){
            add(animal);
        }
    }

    public E get(int index){
        return animalList[index];
    }

    public int size(){
        return index;
    }

    @Override
    public String toString() {
        return "MyDogList{" +
                "dogList=" + Arrays.toString(Arrays.stream(animalList).filter(Objects::nonNull).toArray()) +
                ", index=" + index +
                '}';
    }
}
