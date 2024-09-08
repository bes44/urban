/**
 * Домашнее задание по теме "Encapsulation, getter, getter"
 * Создать класс Gamer с полем private строкового типа nickname и полем private логического типа isActive,
 * оно характеризует в игре сейчас объект класса или нет, т.е. true или false соответственно.
 * Создать конструктор этого класса и методы доступа к полям класса.
 * <p>
 * 2. Создать массив объектов класса Gamer и включить в него не менее пяти объектов класса Gamer
 * с разными nickname и isActive (например, двое будут в игре, т.е. true, двое - нет).
 */
public class Gamer {
    private String nickname;
    private boolean isActive;

    public Gamer(String nickname, boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static void PrintGamers(Gamer[] gs)
    {
        for (Gamer gamer : gs) {
            System.out.println("Nickname: " + gamer.getNickname() + ", Active: " + gamer.isActive());
        }
    }

        public static void main(String[] args) {
            Gamer[] gamers = new Gamer[5];
            gamers[0] = new Gamer("Иван", false);
            gamers[1] = new Gamer("Федор", true);
            gamers[2] = new Gamer("Наканор", false);
            gamers[3] = new Gamer("Алефтина", true);
            gamers[4] = new Gamer("Евпатий", false);
            PrintGamers (gamers);


            }
    }
