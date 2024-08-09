public class Reptiles extends Animal {
    public String skin;
    public String Backbone;
    public String egg;

    public String getSkin() {
        return skin;
    }

    public String getBackbone() {
        return Backbone;
    }

    public String getEgg() {
        return egg;
    }

    public Reptiles() {
        this.skin = "Dry skin";
        this.Backbone = "backnone";
        this.egg = "Self shelled";
    }

    public Reptiles(int height, int weight, String type, String blood, String skin, String backbone, String egg) {
        super(height, weight, type, blood);
        this.skin = skin;
        Backbone = backbone;
        this.egg = egg; }
}
