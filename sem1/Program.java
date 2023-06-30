import units.*;

import java.util.ArrayList;

/*
Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик,
снайпер, арбалетчик, крестьянин. На базе описания персонажей описать
простейшую иерархию классов. В основной программе создать по одному экземпляру каждого класса.
 */
public class Program {
    public static void main(String[] args) {
        ArrayList<Units> units = new ArrayList<>();

        units.add(new Magician("Mage"));
        units.add(new Monk("Monk"));
        units.add(new Robber("Robber"));
        units.add(new Spearman("Spearman"));
        units.add(new Sniper("Sniper"));
        units.add(new Crossbowman("Crossbowman"));
        units.add(new Peasant("Peasant"));

        units.forEach(n-> System.out.println(n.name));
    }
}
