package MyFiles.ch9;

import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println(duck.getSize());

        Duck duck1 = new Duck(65);
        System.out.println(duck1.getSize());

        Color c = new Color(255,240,255);
        System.out.println(c.getGreen());

    }
}
