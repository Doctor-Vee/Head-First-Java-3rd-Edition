package MyFiles.ch4;

class Man {
    String name;
    int age;
}

class Test {
    public static void main(String[] args) {

        Man johnny = new Man();
        Man sergio = new Man();
        Man chibueze = sergio;
        Man chisom = johnny;

        String newton = "John Newton";
        String johnN = "John Newton ";
        System.out.println(newton.equalsIgnoreCase(johnN));


        Man john = new Man();
        john.name = "John";
        System.out.println(john.name);
        System.out.println("Entering the method");
        changeName(john);
        System.out.println("Done with the method");
        System.out.println(john.name);

    }

    static byte changeName(Man man){
        System.out.println("Here name is " + man.name);
        man.name = "Peter";
        System.out.println("Now name is " + man.name);
        return (byte) 330L;
    }
}
