package MyFiles.ch9;

public class Duckling extends Duck{
    public Duckling(){
        super(true);
        System.out.println("Increasing the size by 10 in Duckling class");
        this.size +=10;
    }
}
