public class Car {
    private String doors;
    private String engine;
    private int speed;


    public Car(String doors, String engine, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.speed = speed;
    }

    public String getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }


}