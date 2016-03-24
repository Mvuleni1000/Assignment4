package Assignment4.Principles.DIP.correction;

/**
 * Created by student on 2016/03/24.
 */
public class Manager {


    UnderWorker employee;

    public void setEmployee(UnderWorker e)
    {
        employee = e;
    }

    public void leading()
    {
        employee.getName();
    }
}
