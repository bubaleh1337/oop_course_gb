package units;

public class Units {
    public int health, defence, damage, actionPoints;
    public String name;
    public static boolean haveMana;
    public Units(int health, int defence, int damage, int actionPoints, String name) {
        this.health = health; // хп
        this.defence = defence; // защита
        //this.mana = mana; // мана
        this.damage = damage; // урон
        this.actionPoints = actionPoints; // ход
        this.name = name; // имя
    }

    public boolean hasAP() { // проверка ходов
        if(actionPoints > 0) {
            return true;
        } else return false;
    }
}
