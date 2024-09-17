package MyFiles;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

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
