package AllAvengers;

import java.util.ArrayList;

public abstract class Support extends Avengers {
    protected int mana, magicDamage, attackRange, actionPriority;
    public Support(int x, int y, int initiative, int mana, int magicDamage, int attackRange, int actionPriority) {
        super(x, y, 70, 70, 5, 1, initiative, true);
        this.mana = mana;
        this.magicDamage = magicDamage;
        this.attackRange = attackRange;
        this.actionPriority = actionPriority;
    }

    @Override
    public void step(ArrayList<Avengers> enemy, ArrayList<Avengers> team) {
        Avengers tmp = nearest(enemy);
        if (!isAlive) return;
        if ((int) coordinates.countDistance(tmp.coordinates) <= attackRange) {
            if (mana > 0) {
                tmp.getDamage(damage);
                mana -= 1;
                state = "Attack";
            } else {
                mana += 1;
                state = "Busy";
            }
        } else {
            move(tmp.coordinates, team);
            state = "Moving";
        }
    }
}
