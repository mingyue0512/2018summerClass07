class Data{int x;}//1,2,3,4

class ProtectedRestrict_01{protected String name="05 prtected jin";}//7

class Parent{
	Parent(){System.out.println("Parent()기본생성자");}
	Parent(int a){System.out.println("Parent 매개변수 생성자:"+a);}
}
class Child extends Parent{
	Child(int a){
		System.out.println("Child매개변수 생성자:"+a);
	}
}//super
public class T05_0705 {

	public static void change(int x) {
		x=1000;
		System.out.println("in_change():x="+x);
	}//1
	
	public static void change(Data d) {
		d.x=1000;
		System.out.println("in_change():x="+d.x);
	}//2
	
	public static Data copy_change(Data d) {
		Data tmp=new Data();
		tmp.x=200;
		return tmp;
	}//3
	
	public static Data copy_change1(Data d) {
		Data tmp=new Data();
		tmp.x=10;
		return tmp;
	}//4
	
	private String name="YUST";//5
	
	class PrivateRestrict_05{
		private String name= "05 private jin";
	}//6
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n****1.jiben type");
		Data d=new Data();
		d.x=10;
		System.out.println("in_main():x="+d.x);
		change(d.x);
		
		System.out.println("After change(d.x)");
		System.out.println("in_main():x="+d.x);
		
		System.out.println("\n****2.canzhao type");
		change(d);
		System.out.println("After change(d)");
		System.out.println("in_main():x="+d.x);
		
		System.out.println("\n****3.return type canzhao type");
		Data d2=copy_change(d);
		System.out.println("in_copy tmp.x:="+d.x);
		System.out.println("in_copy tmp.x:="+d2.x);
		System.out.println("d.x:="+d.x);
		System.out.println("d2.x:="+d2.x);
		
		System.out.println("\n****4.return canzhao type,data change");
		Data d3=copy_change1(d);
		System.out.println("d.x:="+d.x);
		System.out.println("d3.x:="+d3.x);
		
		System.out.println("\n****5.  private:YUST");
		T05_0705 pr=new T05_0705();
		System.out.println("\n****5-1.private:"+pr.name);
		
		System.out.println("\n****6.private error:name is not visible");
		/*PrivateRestrict_05 pr01=new PrivateRestrict_05();
		System.out.println(pr01.name);*/
		
		System.out.println("\n****7. 05 Protected jin");
		ProtectedRestrict_01 pr1=new ProtectedRestrict_01();
		System.out.println(pr1.name);
		
		System.out.println("\n****super:parent&child code");
		Child c=new Child(5);
	}

}
