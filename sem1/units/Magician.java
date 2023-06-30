package units;

public class Magician extends Units{
    public int mana;
    public Magician() {
        super(100, 70, 5, 4, "Mage");
    } // Маг
    public Magician(String name) {
        super(100, 70, 5, 4, name);
    }
}
