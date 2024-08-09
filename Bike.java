public class Bike extends Vehicle {
    public String handle;
    public String gears;

    public Bike(String engine, String breaks, String headlight, String mirror, int speed, String handle, String gears) {
        super(engine, breaks, headlight, mirror, speed);
        this.handle = handle;
        this.gears = gears;
    }

    public Bike() {
        this.handle = "Short";
        this.gears = "4";
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                ", gears='" + gears + '\'' +
                ", engine='" + engine + '\'' +
                ", breaks='" + breaks + '\'' +
                ", Headlight='" + Headlight + '\'' +
                ", Mirror='" + Mirror + '\'' +
                ", speed=" + speed +
                '}';
    }
}
