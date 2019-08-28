package MP3;

public class Song {
    // Variables
    public final String name;
    public final Artist artist;
    public final Album album;

    // Constructor
    public Song(String name, Artist artist, Album album) {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    // Method
    @Override
    public String toString() {
        return name + " - " + artist.name + "\n" + album.name + "(" + album.year + ")";
    }
}
