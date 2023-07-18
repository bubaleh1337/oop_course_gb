import AllAvengers.*;

import java.util.*;

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

        int teamCount = 10;
        boolean sortedInitiative = false;
        Random rand = new Random();

        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(7);
            addRandomUnit(val, i, team1, 1);

            val = rand.nextInt(7);
            addRandomUnit(val, i, team2, 10);
        }

        while (!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < team1.size() - 1; i++) {
                if (team1.get(i).initiative < team1.get(i + 1).initiative) {
                    Collections.swap(team1, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }

        sortedInitiative = false;

        while (!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < team2.size() - 1; i++) {
                if (team2.get(i).initiative < team2.get(i + 1).initiative) {
                    Collections.swap(team2, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }
        allTeam.addAll(team1);
        allTeam.addAll(team2);

        View.view();

        Scanner in = new Scanner(System.in);
        while (true) {
            in.nextLine();
            String message = " ";

            int init1 = 0, init2 = 0;
            Avengers tmpTeam1 = team1.get(init1);
            Avengers tmpTeam2 = team2.get(init2);

            for (int i = 0; i < teamCount * 2; i++) {
                if (isTeamDie(team1)) {
                    message = "Team 2 win!";
                    break;
                }
                if (isTeamDie(team2)) {
                    message = "Team 1 win!";
                    break;
                }
                if ((tmpTeam1.initiative >= tmpTeam2.initiative && init1 < 10) || (tmpTeam1.initiative < tmpTeam2.initiative && init2 == 10)) {
                    tmpTeam1.step(team2, team1);
                    init1++;
                    if (init1 < 10) tmpTeam1 = team1.get(init1);
                } else {
                    tmpTeam2.step(team1, team2);
                    init2++;
                    if (init2 < 10) tmpTeam2 = team2.get(init2);
                }
            }

            View.view();

            if (message.equals("Team 2 win!") || message.equals("Team 1 win")) {
                System.out.println(message);
                break;
            }
        }
    }

    public static boolean isTeamDie(ArrayList<Avengers> team) {
        for (Avengers avengers : team) {
            if (!avengers.state.equals("Dead")) return false;
        }
        return true;
    }

    private static void addRandomUnit(int num, int i, ArrayList<Avengers> units, int teamPos) {
        Random rand = new Random();
        switch (num)
        {
            case 0:
                units.add(new SpiderMan(teamPos, i + 1, rand.nextInt(21)));
                break;
            case 1:
                units.add(new CaptainAmerica(teamPos, i + 1, rand.nextInt(21)));
                break;
            case 2:
                units.add(new Thor(teamPos, i + 1, rand.nextInt(21), 1));
                break;
            case 3:
                units.add(new Wasp(teamPos, i + 1, rand.nextInt(21), 1));
                break;
            case 4:
                units.add(new Human(teamPos, i + 1, rand.nextInt(21), 1));
                break;
            case 5:
                units.add(new Hulk(teamPos, i + 1, rand.nextInt(21)));
                break;
            case 6:
                units.add(new AntMan(teamPos, i + 1, rand.nextInt(21)));
                break;
        }
    }
}
