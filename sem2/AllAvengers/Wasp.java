package AllAvengers;

import java.util.ArrayList;

public class Wasp extends Avengers{
    public Wasp(String name, int x, int y) {
        super(30, 100, name, "female", x, y);
    }


    @Override
    public void step(ArrayList<Avengers> units, ArrayList<Avengers> team) {
        Avengers tmp = nearest(units);
    }
}
