package MyFiles.ch10;

import java.util.ArrayList;

public class Duck {
    public static int duckCount;
    public static ArrayList<String> duckNames = new ArrayList<>();
    private int size;

    public Duck(String name) {
        duckCount++;
        System.out.println("Creating duck: " + name + ". Duck count is " + duckCount);
        duckNames.add(name);
    }

    public int getSize(){
        return size;
    }

    public void printNames(){
        System.out.println(duckNames);
    }

    public void getDuckNamesWithConstructor(){
        new Duck("mangoDuck").printNames();
    }
}
