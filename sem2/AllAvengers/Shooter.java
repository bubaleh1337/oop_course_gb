package AllAvengers;

import java.util.ArrayList;

public abstract class Shooter extends Avengers {
    protected int arrows, attackRange, timeToLoad;

    public Shooter(int x, int y, int initiative, int attackRange, int arrows, int timeToLoad) {
        super(x, y, 50, 50, 5, 1, initiative, true);
        this.attackRange = attackRange;
        this.arrows = arrows;
        this.timeToLoad = timeToLoad;
    }

    @Override
    public void step(ArrayList<Avengers> enemy, ArrayList<Avengers> team) {
        Avengers tmp = nearest(enemy);

        if (isAlive) {
            for (Avengers unit: team) {
                if (unit instanceof Human && unit.state == "Stand" && arrows < 20 && this instanceof SpiderMan) {
                    arrows += 1;
                    unit.state = "Busy";
                    return;
                }
            }

            if ((int) coordinates.countDistance(tmp.coordinates) <= attackRange) {
                if (arrows > 0 && attackRange != 1) {
                    if (attackRange == 1) tmp.getDamage(1);
                    else tmp.getDamage(damage);
                    arrows -= 1;
                    state = "Attack";
                    return;
                } else {
                    attackRange = 1;
                    state = "->Melee";
                }
            } else {
                move(tmp.coordinates, team);
                state = "Moving";
                return;
            }
        }
        return;
    }
}
