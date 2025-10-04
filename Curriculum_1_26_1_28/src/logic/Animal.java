package logic;

public class Animal {
    private String name;
    private double height;
    private int speed;
    private String scientificName;

    // コンストラクタ
    public Animal(String name, double height, int speed, String scientificName) {
        this.name = name;
        this.height = height;
        this.speed = speed;
        this.scientificName = scientificName;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getScientificName() {
        return this.scientificName;
    }
}
