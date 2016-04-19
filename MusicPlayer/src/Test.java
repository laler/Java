import java.lang.Math;
public class Test {
    public static void main(String[] args) {
        MusicOrganizer songs = new MusicOrganizer();
        int num = songs.getNumberOfTracks();    //tracks
        //System.out.println(num);
        while (num > 0){
            int rnum = (int)(Math.random()*num);
            songs.playTrack(rnum);
            songs.removeTrack(rnum);
            num--;
        }
        //for (int i = 0; i < num; i++){
        //    songs.listTrack(i);
        //}
        //songs.listAllTracks();
        
        //1. find a random index and play and remove it.-> right here in main
        //2. make a new list with random order and play from 0 to 3.-> change readLibrary() function
    }    
}
