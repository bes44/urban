class Eagle extends Bird {
    public Eagle(double flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Орел летит " + flySpeed + " км/ч.");
    }

    @Override
    public void makeSound() {
        System.out.println("Орел кричит");
    }
}