package AllAvengers;

import java.util.ArrayList;

public class BlackWidow extends Avengers {
    public BlackWidow(String name, int x, int y) {

        super(45, name, "female", x, y);
    }


    @Override
    public void step(ArrayList<Avengers> units) {
        Avengers tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
