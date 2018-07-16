import java.util.Scanner;
class CarCar{
	String color;
	int speed;
	void upSpeed(int value) {
		speed=speed+value;
	}
	void downSpeed(int value) {
		speed=speed-value;
	}
	
}
class dingdan{
	String name;
	int num;
	int value;
	dingdan() {
		this.name = name;
		this.num = num;
		this.value=value;
	}
	public int sum(int sum,int value) {
		sum = value+sum;
		return sum;
	}
}
public class T05_0710 {
	public static int sum=0;
	public static void print_menu() {
		System.out.println("\n menu：pasta、pizza、potato chip、salade");
		System.out.println("1.点菜");
		System.out.println("2.结算");
		System.out.println("3.退出");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n1carcar");
		CarCar myCar1=new CarCar();
		CarCar myCar2=new CarCar();
		CarCar myCar3=new CarCar();
		myCar1.color="red";
		myCar1.speed=0;
		myCar2.color="green";
		myCar2.speed=0;
		myCar3.color="yellow";
		myCar3.speed=0;
		
		myCar1.upSpeed(30);
		System.out.print("\nIt's car1"+","+"myCar1:"+myCar1.color+","+"myCar1:"+myCar1.speed);
		myCar2.upSpeed(60);
		System.out.print("\nIt's car2"+","+"myCar2:"+myCar2.color+","+"myCar2:"+myCar2.speed);
		myCar3.upSpeed(0);
		System.out.print("\nIt's car3"+","+"myCar3:"+myCar3.color+","+"myCar3:"+myCar3.speed);
		
		System.out.println("\n\n2dingcan");
		int i = 0;
		int choice=0;
		String  menu[]= {"pasta","pizza","potato chip","salade"};
		int value[]= {35,60,20,25};
		Scanner sc  = new Scanner(System.in);
		int count=0;
		dingdan a[]= new dingdan[9];
		while (choice !=3) {
			print_menu();
			switch(choice=sc.nextInt()) {
			case 1:
				boolean have = true;
				System.out.println("菜名:");
				String name = sc.next();
				for(i = 0;i<menu.length;i++) {
					if (name.equals(menu[i])) 
						break;
					else
						have=false;
				}
				if(i==menu.length&&have==false) {
					System.out.println("没有这种菜");
					break;
				}
			    a[count]=new dingdan();
				a[count].name=name;
				System.out.println("数量：");
				a[count].num=sc.nextInt();
				a[count].value=a[count].num*value[i];
				sum=a[count].sum(sum, a[count].value);
				count++;
				break;
			case 2:
				int id=0;
				for(id=0;id<count;id++) {
					System.out.println("菜名："+a[id].name+" 数量："+a[id].num);
				}
				System.out.println("总价："+sum);
				break;
			case 3:
				break;
			default:
				System.out.println("\n 输入错误请重新输入\n");
			}
		}
	}

}
