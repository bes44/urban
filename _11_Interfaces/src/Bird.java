public class Bird implements Swimmable, Flyable {
private String name;
private int age;

public Bird(String name, int age) {
        this.name = name;
        this.age = age;
        }

@Override
public void swim() {
        System.out.println(name + " может плавать на поверхности воды.");
        }

@Override
public void fly() {
        System.out.println(name + " летает в небе.");
        }
        }