package MyFiles;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        char name = 65;
        System.out.println((char) (name));

        String [] names = new String[]{"John", "Mary", "Israel"};
        String [] students = names.clone();
        System.out.println(Arrays.toString(students));

        ArrayList<Integer> list = new ArrayList<>(7);
        System.out.println("Address of list right now = " + System.identityHashCode(list));
        list.add(1);
        list.add(10);
//        list.add(100);

        list.add(2, 50);
        list.add(3, 36);
        System.out.println("Address of list after adding 4 elements = " + System.identityHashCode(list));
        list.add(4, 42);
        list.add(16);
        list.add(6, 110);
        System.out.println("Address of list after adding 7 elements = " + System.identityHashCode(list));
        list.add(7, 56);
        list.add( 206);
        list.add(3, 100);
        System.out.println("Address of list after adding 10 elements = " + System.identityHashCode(list));
        System.out.println(list);

        int a = 0;
        System.out.println(++a);

        long num = 2147483649L;
        int man = (int) num;
        System.out.println("man = " + man);
        int woman = -2147483648;
        System.out.println(man + woman);

        int[] ages = new int[4];
        byte Daniel = 45;
        long Shola = 433L;
        ages[0] = Daniel;
        ages[1] = (int) Shola;
        System.out.println(Arrays.toString(ages));


        System.out.println(fibonacci(5));


        char ca = 'd';
        char ce = '1';
        char df = '8';
        byte small = 23;
        int $ = 367;
        byte later = (byte) $;
        long semi = 9223372036854775807L;
        int $class = (int) semi;
        float food = 343.23F;

        System.out.println("Hello world" + $);

    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);  // Each call leads to two more calls, O(2^n)
    }

}
