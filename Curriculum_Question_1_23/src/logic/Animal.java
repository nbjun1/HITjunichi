package logic;

public class Animal {
	// フィールド
	private String name;
	private double height;
	private int speed;
	
	// ここからsetter(値を代入)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
			this.height = height;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// ここからgetter(値を取り出す)
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public int getSpeed() {
		return this.speed;
	}

}
