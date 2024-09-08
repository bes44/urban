public class Piano extends Instrument {

    @Override
    public void play() {
        System.out.println("Играю собачий вальс");
    }

    @Override
    public void tune() {
        System.out.println("Настройка инструмента настройщиком пианино");
    }
}