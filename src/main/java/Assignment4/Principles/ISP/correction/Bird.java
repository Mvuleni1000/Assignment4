package Assignment4.Principles.ISP.correction;

/**
 * Created by student on 2016/03/24.
 */
public class Bird implements Flying,Walking{

    @Override
    public int flySpeed()
    {
        return 55;
    }

    @Override
    public int walkingSpeed()
    {
        return 55;
    }

}