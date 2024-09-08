/**
 * Домашнее задание Inheritance
 *
 * 1.     Создать класс Sportsman с полями строкового типа name, team, поле age – целое число, все поля отмечены модификатором private.
 * Cоздать конструктор класса и методы get для доступа к полям класса. В классе есть метод, описывающий общее действие спортсмена.
 *
 * Создать классы наследники Footballer, HockeyPlayer, Skier.
 * В каждом из них написать свой дополнительный (относящийся к конкретному классу) метод, например,
 * у класса Footballer может быть метод scoringGoals, характеризующий результативную игру забиванием голов,
 * у других классов методы будут свои.
 */
public class Sportsman {
    private String name;
    private String team;
    private int age;

    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public void playSportsman()
    {
        System.out.println("Спортсмен играет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sportsman spman = new Sportsman("Иванов","Динамо",20);
        System.out.println(spman);
        spman.playSportsman();
        HockeyPlayer hman = new HockeyPlayer("Иванов","Динамо Киев",22);
        System.out.println(hman);
        hman.playSportsman();
        hman.drivesThePuck();
        HockeyPlayer hman2 = new HockeyPlayer("Сидоров","Динамо Киев",21);
        System.out.println(hman2);
        hman2.playSportsman();
        hman2.drivesThePuck();
        Footballer fman = new Footballer("Петров","Динамо Москва",30);
        System.out.println(fman);
        fman.playSportsman();
        fman.scoringGoals();
        Skier sman = new Skier("Васильев","Динамо",45);
        System.out.println(sman);
        sman.playSportsman();
        sman.jumpingOnRollerCoaster();
    }
}