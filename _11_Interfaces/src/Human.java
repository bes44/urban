public class Human implements Swimmable{
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void swim() {
            System.out.println(name + " умеет плавать техникой брасс.");
        }
    }
