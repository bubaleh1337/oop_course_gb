package AllAvengers;

import java.util.ArrayList;

// LANCER
public class CaptainAmerica extends Melee{
    public CaptainAmerica(int x, int y, int initiative) {
        super(x, y, initiative + 4, 10, 1, 1, 2);
    }

    @Override
    public String getInfo() {
        return "Lancer [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }
}
