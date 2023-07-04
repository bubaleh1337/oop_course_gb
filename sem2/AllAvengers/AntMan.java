package AllAvengers;

import java.util.ArrayList;

public class AntMan extends Avengers {

    public AntMan(String name, int x, int y) {
        super(30,name, "male", x, y);
    }
    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public void step(ArrayList<Avengers> units) {
        Avengers tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
