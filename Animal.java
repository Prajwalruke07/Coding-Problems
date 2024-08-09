public class Animal {
    public int  height;
    public int weight;
    public String type;
    public String blood;

    public Animal() {
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getBlood() {
        return blood;
    }

    public Animal(int height, int weight, String type, String blood) {
        this.height = height;
        this.weight = weight;
        this.type = type;
        this.blood = blood;
    }
}
