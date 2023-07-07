package AllAvengers;

import java.util.ArrayList;

public class IronMan extends Avengers {
    public IronMan(String name, int x, int y) {
        super(65, 100, name, "male", x, y);
    }


    @Override
    public void step(ArrayList<Avengers> units, ArrayList<Avengers> team) {
        Avengers tmp = nearest(units);
    }
}
