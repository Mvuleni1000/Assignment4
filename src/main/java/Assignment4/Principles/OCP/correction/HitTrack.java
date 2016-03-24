package Assignment4.Principles.OCP.correction;

/**
 * Created by student on 2016/03/24.
 */
public abstract class HitTrack implements MusicStore
{
    @Override
    public  String getAlbum()
    {
        return "Classic";
    }

}