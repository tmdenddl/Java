package MP3;

import java.util.ArrayList;

public class Album {
    // Variables
    public final String name;
    public final int year;
    public final Artist artist;
    public ArrayList<Song> songs = new ArrayList<>();

    // Constructor
    public Album(String name, int year, Artist artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    // Methods
    public Song getTrack(int trackNo) {
        return songs.get(trackNo - 1);
    }

    public void addTrack(Song song) {
        songs.add(song);
    }

    @Override
    public String toString() {
        return name;
    }
}
