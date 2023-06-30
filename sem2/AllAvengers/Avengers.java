package AllAvengers;

public abstract class Avengers implements InGameInterface{
    protected int damage;

    protected String name, sex;


    public Avengers(int damage, String name, String sex) {
        this.damage = damage;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public void step() {

    }
}
