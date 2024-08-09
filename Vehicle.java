public class Vehicle {
    public String engine;
    public String breaks;
    public String Headlight;
    public String Mirror;
    public int speed;


    public Vehicle(String engine, String breaks, String headlight, String mirror, int speed) {
        this.engine = engine;
        this.breaks = breaks;
        Headlight = headlight;
        Mirror = mirror;
        this.speed = speed;
    }
    public Vehicle() {
        this.engine = "Petrol";
        this.breaks = "ABS";
        Headlight = "Led";
        Mirror = "Yes";
        this.speed = 60;
    }

    public String getEngine() {
        return engine;
    }

    public String getBreaks() {
        return breaks;
    }

    public String getHeadlight() {
        return Headlight;
    }

    public String getMirror() {
        return Mirror;
    }

    public int getSpeed() {
        return speed;
    }





}
