package Assignment4.inheritance;

/**
 * Created by student on 2016/03/24.
 */
public class Car extends Parts {

    String model;

    public Car(String Mercedes,String engine, String wheels, String seats)
    {
        super(engine,wheels,seats);
        model = Mercedes;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
