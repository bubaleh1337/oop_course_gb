package AllAvengers;

import java.util.ArrayList;

public abstract class Avengers implements InGameInterface{
    protected int damage;

    protected String name, sex;

    Coordinates coordinates;


    public Avengers(int damage, String name, String sex, int x, int y) {
        this.damage = damage;
        this.name = name;
        this.sex = sex;
        coordinates = new Coordinates(x, y);
    }



    @Override
    public String getInfo() {
        return String.format("name:%s x:%d y:%d", name, coordinates.x, coordinates.y);
    }



    public Avengers nearest(ArrayList<Avengers> units) {
        double nearestDistance = Double.MAX_VALUE;
        Avengers nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if(coordinates.countDistance(units.get(i).coordinates) < nearestDistance) {
                nearestEnemy = units.get(i);
                nearestDistance = coordinates.countDistance(units.get(i).coordinates);
            }
        }
        return nearestEnemy;
    }

    @Override
    public void step(ArrayList<Avengers> units) {

    }
}
