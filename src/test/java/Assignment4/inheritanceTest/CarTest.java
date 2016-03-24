package Assignment4.inheritanceTest;

import Assignment4.inheritance.Parts;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/24.
 */
public class CarTest {

    Parts parts = new Parts("V12","Yokohama","heatedSeats");


    @Test
    public void testCar() throws Exception {

        Assert.assertTrue(parts.getEngine(),true);
        Assert.assertTrue(parts.getSeats(),true);
    }

    @After
    public void tearDown() throws Exception {}
}
