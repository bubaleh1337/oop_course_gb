package units;

public class Peasant extends Units{
    public Peasant() {
        super(60, 10, 5, 4, "Peasant");
    } // крестьянин
    public Peasant(String name) {
        super(100, 70, 5, 4, name);
    }
}
