package MyFiles.ch8;

public class House implements Aesthetics, Habitation {




    @Override
    public String makeBedsAvailable() {
        return null;
    }

    @Override
    public void getProperLighting() {

    }

    @Override
    public void designEverywhere() {
        Aesthetics.super.designEverywhere();
    }

}
