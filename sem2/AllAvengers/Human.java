package AllAvengers;

import java.util.ArrayList;

// Peasant
public class Human extends Support {

    public Human(int x, int y, int initiative, int actionPriority) {
        super(x, y, initiative, 0, 0, 1, actionPriority);
    }

    @Override
    public String getInfo() {
        return "Peasant [" + coordinates.x + ", " + coordinates.y + "] HP: " + hp + "/" + max_hp + " " + state;
    }

    @Override
    public void step(ArrayList<Avengers> enemy, ArrayList<Avengers> team) {
        if (isAlive) {
            if (state == "Busy") {
                state = "Stand";
            }
        }
    }
}
