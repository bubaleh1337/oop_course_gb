package units;

public class Monk extends Units{
    public int mana;
    public Monk() {
        super(100, 60, 10, 4, "Monk");
    } // монах
    public Monk(String name) {
        super(100, 70, 5, 4, name);
    }
}
