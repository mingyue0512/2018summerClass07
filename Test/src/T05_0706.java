class shape{
	public void draw() {
		System.out.println("shape");
		
	}
}

class Line extends shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends shape{
	public void draw() {
		System.out.println("Circle");
	}
}//1

interface PhoneInterface{
	int BUTTONS=20;
	void sendCall();
	void receiveCall();
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{public void play(); public void stop();}

class PDA{
	public int calculate(int x,int y) {
		return x+y;
	}
}
interface MusicPhoneInterface extends PhoneInterface,MP3Interface{
	void sendSMS();
	void receiveSMS();
}
class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{
	public void sendCall() {System.out.println("phone stop");}
	public void receiveCall() {System.out.println("phone ok");}
	public void sendSMS() {System.out.println("SMS send");}
	public void receiveSMS() {System.out.println("SMS receive");}
	
	public void play() {System.out.println("play music");}
	public void stop() {System.out.println("stop music");}
	public void schedule() {System.out.println("schedule manege");}
}//3

abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int substract(int a,int b);
	public abstract double average(int[] a);
}
class GoodCalc extends Calculator{
	public int add(int a,int b) {return a+b;}
	public int substract(int a,int b) {return a-b;}
	public double average(int[] a) {
		double sum=0;
		for(int i=0;i<a.length;i++)sum+=a[i];
		return sum/a.length;
	}
}//2
public class T05_0706 {
	
	static void paint(shape p) {p.draw();}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n**1.overriding:draw()");
		Line line=new Line();
		paint(line);
		paint(new shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
		System.out.println("\n**3.interface");
		SmartPhone p=new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3,5));
		p.schedule();
		
		System.out.println("\n2.extend");
		GoodCalc c=new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.substract(2,3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

}
