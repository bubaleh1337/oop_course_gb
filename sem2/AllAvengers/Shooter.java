package AllAvengers;

import java.util.ArrayList;

public abstract class Shooter extends Avengers {
    protected int arrows = 50;

    public Shooter(int damage, int hp, String name, String sex, int x, int y) {
        super(damage, hp, name, sex, x, y);
    }

    @Override
    public void step(ArrayList<Avengers> units, ArrayList<Avengers> team) {
        // Если жизни 0 вернуть управление
        if (this.hp == 0 || this.arrows == 0) return;
        // Если стрел 0 вернуть управление
        // Найти ближайшего противника
        Avengers tmp = nearest(units);
        // Нанести ему среднее повреждение

        for (Avengers unit:team) {
            if (unit.name.equals("Human")) {
                arrows++;
                break;
            }
        }
        tmp.HP_damage(this.damage);
        // уменьшить кол-во стрел на одну и вернуть управление
        arrows -= 1;
        return;
    }

    @Override
    public String getInfo() {
        return String.format("name:%s hp:%d arrows:%d", name, hp, arrows);
    }
}
