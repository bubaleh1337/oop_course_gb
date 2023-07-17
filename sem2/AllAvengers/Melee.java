package AllAvengers;

import java.util.ArrayList;

public abstract class Melee extends Avengers{
    protected int attacksAmount, attackRange;
    public Melee(int x, int y, int initiative, int damage, int moveDistance, int attacksAmount, int attackRange) {
        super(x, y, 100, 100, damage, moveDistance, initiative, true);
        this.attacksAmount = attacksAmount;
        this.attackRange = attackRange;
    }

    @Override
    public void step(ArrayList<Avengers> enemy, ArrayList<Avengers> team) {
        if (!isAlive) return;

        Avengers tmp = nearest(enemy);

        if (coordinates.countDistance(tmp.coordinates) <= attackRange) {
            for (int i = 0; i < attacksAmount; i++) {
                tmp.getDamage(damage);
            }
            state = "Attack";
        } else {
            move(tmp.coordinates, team);
            state = "Moving";
        }
    }
}
