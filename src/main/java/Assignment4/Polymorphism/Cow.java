package Assignment4.Polymorphism;

/**
 * Created by student on 2016/03/24.
 */
public class Cow extends Animal  implements Vegetarian{

    String breed;

    Cow d = new Cow();
    Animal a =d;
    Vegetarian v = d;

    public String greenStaff(String type)
    {
        return type;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
