public class Footballer extends Sportsman{
    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }
@Override
    public void playSportsman()
    {
        System.out.println("Футболист играет в футбол ");
    }

    public void scoringGoals()
    {
        System.out.println("Футболист заюбивает мячи");
    }
}
