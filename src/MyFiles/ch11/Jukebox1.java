package MyFiles.ch11;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go(){
        List<SongV2> songList = MockSongs.getSongsV2();

        System.out.println(songList);
//        Collections.sort(songList);
        System.out.println(songList);


    }
}
