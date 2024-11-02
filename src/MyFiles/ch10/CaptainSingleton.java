package MyFiles.ch10;

public class CaptainSingleton {

    public String name;
    private static int numberOfCreations;
    private static CaptainSingleton instance;

    private CaptainSingleton() {
        System.out.println("Creating an instance of CaptainSingleton");
        numberOfCreations++;
    }

    public static CaptainSingleton getInstance() {
        if (instance == null) {
            instance = new CaptainSingleton();
        }
        return instance;
    }

    public static int getNumberOfCreations() {
        return numberOfCreations;
    }

    public void sayHello(){
        System.out.println("Singleton says \"Hello\"");
    }
}
