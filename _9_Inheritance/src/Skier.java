public class Skier extends Sportsman{
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }
    @Override
    public void playSportsman()
    {
        System.out.println("Лыжник катается");
    }
    public void jumpingOnRollerCoaster()
    {
        System.out.println("Лыжник прышает на горках");
    }

}
