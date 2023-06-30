import AllAvengers.*;

import java.util.ArrayList;

/*
Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа.
Создать два списка в классе main. В каждый из списков добавить по десять случайных экземнляров
наследников BaseHero. Удалить ненужные методы из абстрактного класса, если такие есть.
В main пройти по спискам и вызвать у всех персонажей getInfo.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Avengers> list = new ArrayList<>();
        list.add(new AntMan(Names.AntMan.getName()));
        list.add(new BlackWidow(Names.BlackWidow.getName()));
        list.add(new CaptainAmerica(Names.CaptainAmerica.getName()));
        list.add(new Hulk(Names.Hulk.getName()));
        list.add(new IronMan(Names.IronMan.getName()));
        list.add(new SpiderMan(Names.SpiderMan.getName()));
        list.add(new Thor(Names.Thor.getName()));
        list.add(new Wasp(Names.Wasp.getName()));
        list.forEach(n-> System.out.println(n.getInfo()));
    }
}
