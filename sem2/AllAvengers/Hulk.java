package AllAvengers;

import java.util.ArrayList;
// ROGUE
public class Hulk extends Melee{
    public Hulk(int x, int y, int initiative) {
        super (x, y, initiative + 4, 5, 2, 2, 1);
    }

    @Override
    public String getInfo() {
        return "Rogue [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }
}
