package klasywewnetrzne;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car {
    private Engine engine;
    private int fuel;

    public Car() {
        engine = new Engine("Porshe");
        System.out.println("Create car with engine " + engine.engineType);
    }

    public void go() {
        while (fuel > 0) {
            engine.consumeFuel();
            System.out.println("Remain " + fuel + "fuel litres");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lack of fuel");
    }


    public void refuel(int litres) {
        fuel = fuel + litres;
    }

    //inner class
    public class Engine {

        private String engineType;
        private static final int FUEL_CONSUMPTION = 20;

        public Engine(String type) {
            engineType = type;
        }

        public void consumeFuel() {
            fuel = fuel - FUEL_CONSUMPTION;
        }

    }


}
