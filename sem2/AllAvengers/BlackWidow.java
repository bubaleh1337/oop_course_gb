package AllAvengers;

import java.util.ArrayList;

public class BlackWidow extends Avengers {
    public BlackWidow(String name, int x, int y) {

        super(45, 100, name, "female", x, y);
    }


    @Override
    public void step(ArrayList<Avengers> units, ArrayList<Avengers> team) {
        Avengers tmp = nearest(units);
    }
}
