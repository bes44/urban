class Hawk extends Bird {
    public Hawk(double flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Ястреб летит  " + flySpeed + " км/ч.");
    }

    @Override
    public void makeSound() {
        System.out.println("Ястреб кричит ");
    }
}