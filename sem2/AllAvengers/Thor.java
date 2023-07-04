package AllAvengers;

import java.util.ArrayList;

public class Thor extends Avengers{
    public Thor(String name, int x, int y) {
        super(95, name, "male", x ,y);
    }


    @Override
    public void step(ArrayList<Avengers> units) {
        Avengers tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
