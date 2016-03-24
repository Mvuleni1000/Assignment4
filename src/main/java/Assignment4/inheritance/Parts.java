package Assignment4.inheritance;

/**
 * Created by student on 2016/03/24.
 */
public class  Parts{

    String engine;
    String wheels;
    String seats;


    public Parts(String VR6,String runFlat,String sportSeats)
    {
        engine=VR6;
        wheels=runFlat;
        seats=sportSeats;
    }

    public String getEngine() {
        return engine;
    }

    public String getWheels() {
        return wheels;
    }

    public String getSeats() {
        return seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}
