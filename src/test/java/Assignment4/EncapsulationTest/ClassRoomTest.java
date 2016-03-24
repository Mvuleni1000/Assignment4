package Assignment4.EncapsulationTest;

import Assignment4.Encapsulation.ClassRoom;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/24.
 */
public class ClassRoomTest {


    ClassRoom room = new ClassRoom();
    @Before
    public void setUp() throws Exception {}

    @Test
    public void TestClassRoom() throws Exception {
        room.setChairs("100");
        room.setStudents("12");
        room.setTable("20");
        room.setLecutures("2");

        Assert.assertSame(room.getLecutures(), "2");
    }

    @After
    public void tearDown() throws Exception {}
}
