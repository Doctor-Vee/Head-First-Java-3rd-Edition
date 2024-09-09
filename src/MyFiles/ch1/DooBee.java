package MyFiles.ch1;

public class DooBee {

    String name;
    public static void main(String[] args) {

        DooBee dooBee = new DooBee();
        dooBee.name = "Fred";
        dooBee.sayName();

        int x = 1;
        while (x < 3 ) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.print("Do");
        }


    }

    public void sayName(){
        System.out.println("My name is " + name);
    }
}
