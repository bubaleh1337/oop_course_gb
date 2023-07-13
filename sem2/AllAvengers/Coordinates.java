package AllAvengers;

import java.util.ArrayList;

public class Coordinates {
    int x, y;
    ArrayList<Integer> xy = new ArrayList<>();

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
        xy.add(0, x);
        xy.add(1, y);
        //return xy;
    }

    public double countDistance(Coordinates coordinates) {
        int dx = coordinates.x - x;
        int dy = coordinates.y - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

}
