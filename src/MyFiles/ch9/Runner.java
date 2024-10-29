package MyFiles.ch9;

public class Runner {
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println(duck.getSize());

        Duck duck1 = new Duck(65);
        System.out.println(duck1.getSize());
    }
}
