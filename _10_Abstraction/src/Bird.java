abstract class Bird {
    protected double flySpeed;

    public Bird(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public abstract void fly();

    public abstract void makeSound();
}