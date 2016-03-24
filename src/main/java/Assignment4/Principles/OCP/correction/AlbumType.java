package Assignment4.Principles.OCP.correction;

/**
 * Created by student on 2016/03/24.
 */
public class AlbumType extends HitTrack implements MusicStore {

    @Override
    public String getAlbum()
    {
        return "Soul";
    }
}