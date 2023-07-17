package AllAvengers;

import java.util.ArrayList;

// SNIPER
public class AntMan extends Shooter {

    public AntMan(int x, int y, int initiative) {
        super(x, y, initiative + 3, 7, 100, 1);
    }
    @Override
    public String getInfo() {
        return "Sniper [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }
}
