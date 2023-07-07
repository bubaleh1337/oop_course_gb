package AllAvengers;

import java.util.ArrayList;

public class AntMan extends Avengers {

    public AntMan(String name, int x, int y) {

        super(30,100, name, "male", x, y);
    }

    @Override
    public void step(ArrayList<Avengers> units, ArrayList<Avengers> team) {
        Avengers tmp = nearest(units);
    }
}
