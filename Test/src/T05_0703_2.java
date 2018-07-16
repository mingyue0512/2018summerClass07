import java.util.Scanner;
public class T05_0703_2{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();	
		}
		int p = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>p)
				p=a[i];
		}
		System.out.println("max:"+p);
		for(int i=0;i<a.length;i++) {
			if(a[i]<p)
				p=a[i];
		}
		System.out.println("min:"+p);
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum:"+sum);
		System.out.println("avg:"+sum/5);	
	}
}
