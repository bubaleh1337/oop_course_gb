package AllAvengers;

import java.util.ArrayList;

public class IronMan extends Shooter {
    public IronMan(int x, int y, int initiative) {
        super(x, y, initiative + 3, 8, 15, 0);
    }
    @Override
    public String getInfo() {
        return "IronMan [" + coordinates.x + ", " + coordinates.y + "] arrows: " + arrows + " HP: " + hp + "/" + max_hp + " " + state;
    }
}
