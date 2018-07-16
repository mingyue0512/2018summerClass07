class Card{
	static String kind;
	static int number;
	static int witch=100;
	static int height=250;
	static int witch1=50;
	static int height1=80;
}//1

class Car{
	 static String color;
	 static String gearType;
	static int door;
}//2

class InitTest{
	static int cv=1;
	int iv=1;
	static {cv=2;}
	{iv=2;}
	InitTest(){iv=3;}
}//3
class fac{
int method(int n) {
	if(n==1)  
		return 1;
	else
	return n * method(n-1);
}
}//4

public class T05_0704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n****1.Card");
		System.out.println("Card.witch="+Card.witch);
		System.out.println("Card.height="+Card.height);
		
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		System.out.println("c1는"+c1.kind+","+c1.number+"이며"+","+"크기는("+c1.witch+","+c1.height+")");
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		System.out.println("c2는"+c1.kind+","+c2.number+"이며"+","+"크기는("+c2.witch+","+c2.height+")");
		System.out.println("c1과ㅊ2의 width,height를 각각50,80으로 변경합니다.");
		System.out.println("c1는"+c1.kind+","+c1.number+"이며"+","+"크기는("+c1.witch1+","+c1.height1+")");
		System.out.println("c2는"+c1.kind+","+c2.number+"이며"+","+"크기는("+c2.witch1+","+c2.height1+")");
		System.out.println("\n****2.Car");
		Car car1 = new Car();
		car1.color="white";
		car1.gearType="auto";
		car1.door=4;
		System.out.println("car1의 color="+Car.color+","+"gearType="+Car.gearType+","+"door="+Car.door);
		Car car2 = new Car();
		car2.color="black";
		car2.gearType="gear";
		car2.door=6;
		System.out.println("car2의 color="+Car.color+","+"gearType="+Car.gearType+","+"door="+Car.door);
		Car car3 = new Car();
		car3.color="blue";
		car3.gearType="auto";
		car3.door=4;
		System.out.println("car3의 color="+Car.color+","+"gearType="+Car.gearType+","+"door="+Car.door);
		Car car4 = new Car();
		car4.color="black";
		car4.gearType="gear";
		car4.door=6;
		System.out.println("car4의 color="+Car.color+","+"gearType="+Car.gearType+","+"door="+Car.door);
		
		System.out.println("\n****3.Init");
		InitTest it = new InitTest();
		System.out.printf("cv=%d,iv=%d",it.cv,it.iv);
	 
		System.out.println("\n****4.Factorial 4");
		fac a = new fac();
		int result = a.method(4);
		System.out.println("factorial 4' result:"+result);
		
	}

}
