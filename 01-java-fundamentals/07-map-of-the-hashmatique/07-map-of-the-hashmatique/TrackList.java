import java.util.HashMap;


public class TrackList {
    public static void main(String[] args) {
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("Maniac", "Maniac you dirty villain.");
    trackList.put("Drop Dead", "You can go to Hell or drop dead!");
    trackList.put("The Day You Die", "The day you die, we will meet.");
    trackList.put("Lucifera", "I'm the devil's daughter!");



    System.out.println("Your track's lytics are:" + " " + trackList.get("Drop Dead"));
    System.out.println("TRACKLIST");
    for(HashMap.Entry<String, String> track : trackList.entrySet()) {
    System.out.println(track.getKey() + " : " + track.getValue());
    }
} 
    }
