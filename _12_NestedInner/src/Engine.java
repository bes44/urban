class Engine {
    private boolean isRunning;

    public void start() {
        isRunning = true;
        System.out.println("Двигатель запущен");
            class Piston {
            public void convertEnergy() {
                System.out.println("Поршень выполняет преобразования энергии горения топлива в механическую энергию");
            }
        }
        Piston piston = new Piston();
        piston.convertEnergy();

        class FuelInjector {
            public void injectFuel() {
                System.out.println("Инжектор добавляет топливо");
            }
        }
        FuelInjector fuelInjector = new FuelInjector();
        fuelInjector.injectFuel();
    }

    public void stop() {
        isRunning = false;
        System.out.println("Двигатель остановлен");
    }

    public boolean isRunning() {
        return isRunning;
    }
}

