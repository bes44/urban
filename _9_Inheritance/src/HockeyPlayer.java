public class HockeyPlayer extends Sportsman{
    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }
    @Override
    public void playSportsman()
    {
        System.out.println("Хоккеист играет в хоккей");
    }
    public void drivesThePuck()
    {
        System.out.println("Хоккеист водит шайбу");
    }

}
