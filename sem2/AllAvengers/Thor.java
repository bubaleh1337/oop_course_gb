package AllAvengers;

import java.util.ArrayList;

public class Thor extends Avengers{
    public Thor(String name, int x, int y) {
        super(95, 100, name, "male", x ,y);
    }


    @Override
    public void step(ArrayList<Avengers> units, ArrayList<Avengers> team) {
        Avengers tmp = nearest(units);
    }
}
