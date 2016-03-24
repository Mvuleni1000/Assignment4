package Assignment4.Principles.ISP.violation;

/**
 * Created by student on 2016/03/24.
 */
public class Person implements Walking {

    @Override
    public int walkSpeed()
    {
        return 30;
    }

}