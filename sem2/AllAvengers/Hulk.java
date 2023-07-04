package AllAvengers;

import java.util.ArrayList;

public class Hulk extends  Avengers{
    public Hulk(String name, int x, int y) {
        super(70, name, "male", x, y);
    }


    @Override
    public void step(ArrayList<Avengers> units) {
        Avengers tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
