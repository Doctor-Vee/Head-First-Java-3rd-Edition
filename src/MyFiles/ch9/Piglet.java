package MyFiles.ch9;

public class Piglet extends Pig{

    public Piglet(){
        System.out.println("Creating the piglet");
    }

    public Piglet(int height){
//        super(height);
        super();
        System.out.println("Creating the piglet with a given height");
    }

}
