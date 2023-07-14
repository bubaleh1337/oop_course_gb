import AllAvengers.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа.
Создать два списка в классе main. В каждый из списков добавить по десять случайных экземнляров
наследников BaseHero. Удалить ненужные методы из абстрактного класса, если такие есть.
В main пройти по спискам и вызвать у всех персонажей getInfo.
 */

/*
в методе step() :
1.Если жизни 0 вернуть управление
2.Если стрел 0 вернуть управление
3.Найти ближайшего противника
4.Нанести ему среднее повреждение
5.Если среди своих есть крестьянин вернуть управление
6.уменьшить кол-во стрел на одну и вернуть управление

Вызывать персонажей из обеих комманд в порядке инициативы.
 */

/*
Делаем крестьян! В степе проверяем жив ли он и
если жив сбрасываем флаг занятости или поле state
 */

/*
Реализовать визуализацию своего проекта по примеру семинара
с использованием приложенных классов. Доработать степ крестьян и магов!
 */

/*
Делаем ход пехоты!
1. Проверяем здоровье
2. Ищем ближайшего врага
3. Двигаемся в сторну врага
4. Не наступаем на живых персонажей
5. Если расстояние до врага одна клетка бём его!
 */
public class Main {
    public static ArrayList<Avengers> team1 = new ArrayList<>();
    public static ArrayList<Avengers> team2 = new ArrayList<>();
    public static ArrayList<Avengers> allTeam = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Your Team1:");

        int teamCount = 10;
        Random rand = new Random();

        for (int i = 1; i < teamCount + 1; i++) {
            int val = rand.nextInt(5) + 1;
            switch (val) {
                case 1:
                    team1.add(new AntMan(Names.AntMan.getName(), 1, i));
                    break;
                case 2:
                    team1.add(new BlackWidow(Names.BlackWidow.getName(), 1, i));
                    break;
                case 3:
                    team1.add(new CaptainAmerica(Names.CaptainAmerica.getName(), 1, i));
                    break;
                case 4:
                    team1.add(new Hulk(Names.Hulk.getName(), 1, i));
                case 5:
                    team1.add(new Human(Names.Human.getName(), 1, i));
            }
        }
        for (int i = 1; i < teamCount + 1; i++) {
            int val = rand.nextInt(5) + 1;
            switch (val) {
                case 1:
                    team2.add(new IronMan(Names.IronMan.getName(), 10, i));
                    break;
                case 2:
                    team2.add(new SpiderMan(Names.SpiderMan.getName(), 10, i));
                    break;
                case 3:
                    team2.add(new Thor(Names.Thor.getName(), 10, i));
                    break;
                case 4:
                    team2.add(new Wasp(Names.Wasp.getName(), 10, i));
                    break;
                case 5:
                    team2.add(new Human(Names.Human.getName(), 10, i));
                    break;
            }
        }

        allTeam.addAll(team1);
        allTeam.addAll(team2);
        //allTeam.sort(Avengers::compareTo);

        Scanner in = new Scanner(System.in);
        while(true) {
            View.view();
            in.nextLine();
            for (Avengers avengers : allTeam) {
                if (team2.contains(avengers)) avengers.step(team1, team2);
                else avengers.step(team2, team1);
            }
            if (isTeamDie(team1)) {
                System.out.println("Team 2 (Blue) win");
                break;
            }
            if (isTeamDie(team2)) {
                System.out.println(("Team 1 (Green) win"));
                break;
            }
        }
    }
    static boolean isTeamDie(ArrayList<Avengers> team) {
        for (Avengers avengers: team) {
            if (!avengers.equals("dead")) return false;
        }
        return true;
    }
}
