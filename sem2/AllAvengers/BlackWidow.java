package AllAvengers;

import java.util.ArrayList;

public class BlackWidow extends Shooter {
    public BlackWidow(int x, int y, int initiative) {

        super(x, y, initiative + 3, 6, 100, 1);
    }
    @Override
    public String getInfo() {
        return "Widow [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }
}
