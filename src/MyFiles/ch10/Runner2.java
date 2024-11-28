package MyFiles.ch10;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

public class Runner2 {
    public static void main(String[] args) {
        boolean result = Boolean.parseBoolean("TRDGUE");
        System.out.println( result);

        String number = String.valueOf(34.55);
        System.out.println(number);

        String number2 = 4_54.45 + "";
        System.out.println(number2);

        int plenty = 1223344551;
        System.out.printf("%,d", plenty);
        Double billions = 1_999_44_555.556;
        System.out.printf("%nMan is here => %,.5f bugs to fix %n%n%n", billions);

        System.out.println(String.format("I have $%,15.2f balance and %,d bugs to fix.", 476578.09876, 3));
        System.out.println(String.format("I have %,20d bugs to fix.", 1305));

        System.out.printf("Here's the number =>%,6.1f", 42.000);

        BigDecimal one = BigDecimal.valueOf(23444.355623);
        System.out.printf("%nThere's a BigDecimal number displayed here => %,.4f", one);

        System.out.printf("%nHere's a hexadecimal value conversion => %x", 65);

        System.out.printf("%nHere's a character conversion => %c%n", 67);

        Duck duck = new Duck("newDuck");
        duck.getDuckNamesWithConstructor();



    }


}
