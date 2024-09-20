package MyFiles;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DataStructures {
    public static void main(String[] args) {

        System.out.println("-------------- Deque --------------");
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.add(45);
        deque.add(50);
        deque.add(55);
        deque.add(60);
        System.out.println(deque.removeFirst());
        System.out.println(deque.remove(50));
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);

        System.out.println("-------------- List --------------");
        List<Integer> integers = new ArrayList<>();
        integers.add(45);
        integers.add(50);
        integers.add(55);
        integers.add(60);
        System.out.println(integers.remove(Integer.valueOf(45)));
        System.out.println(integers);

        System.out.println("-------------- Vector --------------");
        Vector<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(50);
        vector.add(55);
        vector.add(60);
        System.out.println(vector.remove(2));
        System.out.println(vector);


        System.out.println("-------------- Stack --------------");
        Stack<Integer> stack = new Stack<>();
        stack.add(45);
        stack.add(50);
        stack.add(55);
        stack.add(60);
        System.out.println(stack.pop());
        System.out.println(stack.search(55));
        System.out.println(stack);
        System.out.println(stack.firstElement());


        System.out.println("-------------- ArrayList --------------");
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(50);
        list.add(55);
        list.add(60);
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(2)));
        System.out.println(list);
    }
}
