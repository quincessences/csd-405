// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 05/29/2022
// Assignment: Module 1 Assignment
// Purpose: Create a fan program
// References: https://www.codejava.net/coding/java-getter-and-setter-tutorial-from-basics-to-best-practices; https://www.makeuseof.com/create-classes-in-java/; https://gist.github.com/arunenigma/2899210

public class MichaelsFan {
	static final int STOPPED = 0;
	static final int SLOW = 1;
	static final int MEDIUM = 2;
	static final int FAST = 3;
   
	private int speed=STOPPED;
	private boolean on=false;
	private double radius=6;
	String color="white";
   
	//Constructor which stores default values
	public MichaelsFan(){
		speed = 0;
		on = false;
		radius = 6;
		color = "white";
	}
   
	public String toString(){
		String onoff;
		if(on())
		onoff="on";
		else
		onoff="off";
		
		if(on){
			return "The "+this.getRadius()+" inch "+this.getColor()+" fan is on at a speed of "+this.getSpeed()+".";
		}
		else{
			return "The "+this.radius+" inch "+this.getColor()+" fan is "+onoff+".";
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean on() {
		return on;
	}
	public void setFanOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public static void main(String[] args) {
		MichaelsFan fan1 = new MichaelsFan();
		System.out.println(fan1.toString());
		System.out.println();
		
		MichaelsFan fan2 = new MichaelsFan();
		fan2.setSpeed(MichaelsFan.MEDIUM);
		fan2.setRadius(7);
		fan2.setColor("pink");
		fan2.setFanOn(true);
		System.out.println(fan2.toString());
		System.out.println();
	}
}
	