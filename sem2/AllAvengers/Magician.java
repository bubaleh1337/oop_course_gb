package AllAvengers;

import java.util.ArrayList;

public class Magician extends Avengers {


    public Magician(int damage, int hp, String name, String sex, int x, int y) {
        super(damage, hp, name, sex, x, y);
    }

    @Override
    public void step(ArrayList<Avengers> units, ArrayList<Avengers> team) {
        if (!state.equals("dead")) {
            float min_XP = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < team.size(); i++) {
                if ((float) (team.get(i).hp / max_hp) < min_XP) {
                    min_XP = (float) (team.get(i).hp / max_hp);
                    index = i;
                }
            }
            team.get(index).HP_damage(this.damage);
        }
    }
}
