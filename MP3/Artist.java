package MP3;

import java.util.ArrayList;

public class Artist {
    // Variables
    public final String name;
    private ArrayList<Album> albums;

    // Constructor
    public Artist(String name) {
        this.name = name;
        albums = new ArrayList<>();
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    // Methods
    public void addAlbum(Album album) {
        albums.add(album);
    }
}
