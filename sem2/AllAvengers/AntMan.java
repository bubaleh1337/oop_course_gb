package AllAvengers;

public class AntMan extends Avengers {
    public AntMan(String name) {
        super(30,name, "male");
    }
    @Override
    public String getInfo() {
        return name;
    }
}
