// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 05/29/2022
// Assignment: Module 2 Assignment
// Purpose: Create a fan program
// References: https://www.codejava.net/coding/java-getter-and-setter-tutorial-from-basics-to-best-practices; https://www.makeuseof.com/create-classes-in-java/; https://gist.github.com/arunenigma/2899210import java.util.ArrayList;

import java.util.Scanner;

public class MichaelsFan2 {
    public static void main(String[] args) {
    MichaelsFan fan1 = new MichaelsFan();
    System.out.println(fan1.toString());
    fan1.setFanOn(false);
    System.out.println("Fan 1 working set to " + fan1.on()+".");
    System.out.println();
    
    MichaelsFan fan2 = new MichaelsFan(2, 7, "pink", true);
    System.out.println(fan2.toString());
	fan2.setColor("yellow");
	System.out.print("Fan 2 color changed to "+fan2.getColor()+".");
    System.out.println();

	ArrayList<MichaelsFan> fansList = new ArrayList<>();
	fansList.add(fan1);
	fansList.add(fan2);
	System.out.println();

	MichaelsUseFans useFans = new MichaelsUseFans();
	useFans.displayCollection(fansList);
    }
}
class MichaelsFan {
	static final int STOPPED = 0;
	static final int SLOW = 1;
	static final int MEDIUM = 2;
	static final int FAST = 3;
   
	private int speed;
	private boolean on;
	private double radius;
	String color;
   
	//constructor which stores default values
	public MichaelsFan(){
		speed = STOPPED;
		on = false;
		radius = 6;
		color = "white";
	}

	//constructor to set defaults
	public MichaelsFan(int speed, double radius, String color, boolean on) {
		this.speed=speed;
		this.radius=radius;
		this.color=color;
		this.on=on;
	}

	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean on() {
		return this.on;
	}
	public void setFanOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
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
}

class MichaelsUseFans {

    ArrayList<MichaelsFan> fanCollection;

    public MichaelsUseFans() {
        this.fanCollection = new ArrayList<>();
    }

	//details of collection
    public void displayCollection(ArrayList<MichaelsFan> fanCollection){
        for(MichaelsFan fan : fanCollection){
            System.out.println("STOPPED = " + 0 + "\nSLOW = " + 1 + "\nMEDIUM = " + 2 + "\nFAST = " + 3
                    + "\nSpeed = " + fan.getSpeed() + "\nFan On = " + fan.on() + "\nRadius = " + fan.getRadius() + "\nColor = "+ fan.getColor() +"\n");
        }

    }
	//details of fan
    public void displayDetail(MichaelsFan fan){
        System.out.println("STOPPED = " + 0 + "\nSLOW = " + 1 + "\nMEDIUM = " + 2 + "\nFAST = " + 3
                + "\nSpeed = " + fan.getSpeed() + "\nFan On = " + fan.on() + "\nRadius = " + fan.getRadius() + "\nColor = "+ fan.getColor());
    }

}