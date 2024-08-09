public class Truck extends Vehicle {
    public String steering;
    public String Music;
    public int cam;

    public Truck(String engine, String breaks, String headlight, String mirror, int speed, String steering, String music, int cam) {
        super(engine, breaks, headlight, mirror, speed);
        this.steering = steering;
        Music = music;
        this.cam = cam;
    }

    public Truck() {
        this.steering = "Round";
        Music = "Mp3";
        this.cam = 2;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", Music='" + Music + '\'' +
                ", cam=" + cam +
                ", engine='" + engine + '\'' +
                ", breaks='" + breaks + '\'' +
                ", Headlight='" + Headlight + '\'' +
                ", Mirror='" + Mirror + '\'' +
                ", speed=" + speed +
                '}';
    }
}