package MyFiles.ch2;

class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}


class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        DrumKit e = new DrumKit();

        DrumKit [] drumKits = new DrumKit[3];

        drumKits[0] = d;
        drumKits[1] = e;
        drumKits[2] = new DrumKit();
        drumKits[2].snare = true;

        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }
        d.playSnare();

        d.playTopHat();

        DrumKit f = e;

        e.topHat = false;
        e.snare = true;

        f.snare = false;

        e = d;

        System.out.println(d.snare);
        System.out.println(drumKits[1].snare);
        System.out.println(e.snare);
        System.out.println(e.topHat);


    }

}