package MyFiles.ch5;

public class ForLoop {
    public static void main(String[] args) {

        int a = 0;
        int b = a--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        for(int i = 0, j = 8; isNotMultipleOf7(); i++, j=i){
            System.out.print("i = " + i);
            System.out.println(" and j = " + j);
        }

    }

    public static boolean isNotMultipleOf7(){
        int num = (int) (Math.random() * 100);
        System.out.println("num = " + num);
        return num % 7 != 0;
    }
}
