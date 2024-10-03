package MyFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int boy = 54;
        if(boy < 50 && (boy = 50) > 70){
            System.out.println("Boy is big and his value is " + boy);
        } else {
            System.out.println("Boy is small with a value of " + boy);
        }

        char name = 65;
        System.out.println((char) (name));

        String [] names = new String[]{"John", "Mary", "Israel"};
        System.out.println("Names: ---------");
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted Names: --------------");
        System.out.println(Arrays.toString(names));
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
        System.out.println(list.indexOf(500)); // -1
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

        List<String> women = new ArrayList<>(Arrays.asList("Mary", "Angel", "Martha", "Esther", "Deborah", "Esther", "Mary", "Martha", "Mary"));
        List<String> mWomen = List.of("Mary", "Martha");
        System.out.println("Women = " + women);
        women.removeAll(mWomen);
        System.out.println("Women again = " + women);

        int [] arr = new int[] {1,2,3,4,5,6,66,77,88,99,120};
        System.out.println(binarySearch(arr, 0, 10, 16));

    }

    static int binarySearch(int[] arr, int l, int r, int x) {
        System.out.println("Entered the function");
        if (r >= l) {
            int mid = l + (r - l) / 2;  // line 4

            // If the element is present at the middle
            if (arr[mid] == x)  // line 8
                return mid;

            // If element is smaller than mid, it must be in left subarray
            if (arr[mid] > x)  // line 10
                return binarySearch(arr, l, mid - 1, x);

            // Else the element must be in the right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // Element is not present in the array
        return -1;
    }


    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);  // Each call leads to two more calls, O(2^n)
    }

}
