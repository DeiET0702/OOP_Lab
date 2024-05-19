package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>;

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getCDLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    public String getArtist() {
        return artist;
    }
    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        }
    }
    public int getCDLength() {
        int CDLength = 0;
        for (Track track : tracks) {
            CDLength += track.getLength();
        }
        return CDLength;
    }

}
