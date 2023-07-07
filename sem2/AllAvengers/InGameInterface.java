package AllAvengers;

import java.util.ArrayList;

public interface InGameInterface {

    void step(ArrayList<Avengers> units, ArrayList<Avengers> team);
    String getInfo();
}
