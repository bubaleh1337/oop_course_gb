package AllAvengers;

import java.util.ArrayList;

public class Hulk extends  Avengers{
    public Hulk(String name, int x, int y) {
        super(70, 100, name, "male", x, y);
    }


    @Override
    public void step(ArrayList<Avengers> units, ArrayList<Avengers> team) {
        Avengers tmp = nearest(units);
    }
}
