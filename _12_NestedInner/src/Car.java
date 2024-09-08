public class Car {
    private String carBrand;
    private double speed;
    private double weight;

    public Car(String carBrand, double speed, double weight) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Марка машины: " + carBrand);
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Вес машины: " + weight + " кг");
    }
}