import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//15103019
public class T05_0709 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("\n1  fi1.FileInputStream:char");
		FileInputStream fi1=new FileInputStream("c:/test");
		int ch1;
		while((ch1=fi1.read())!=-1)
			System.out.print((char)ch1);
		fi1.close();
		
		System.out.println("\n2  fi2 FileInputStream:byte");
		FileInputStream fi2=new FileInputStream("c:/test");
		int ch2;
		byte[] bt=new byte[1024];
		int i=0;
		while((ch2=fi2.read())!=-1) {
			bt[i]=(byte)ch2; i++;
		}
			System.out.print(new String(bt));
		fi2.close();
		
		System.out.println("\n  fi3 FileReader");
		FileReader fReader=new FileReader("c:/test");
		BufferedReader bReader = new BufferedReader(fReader);
		String str=null;
		while((str=bReader.readLine())!=null) {
			System.out.print(str);
		}
		bReader.close();     fReader.close();
		
		System.out.println("\n  fi4 scanner");
		Scanner sc =new Scanner(new File("c:/add"));
		int hap=0,value=0;
		while(sc.hasNext()) {
			value=sc.nextInt();
			System.out.println("value:"+value);
			hap+=value;
		}
		System.out.println("sum:"+hap);
		sc.close();
		
		System.out.println("\n  fi6 FileWriter");
		FileWriter fw6=new FileWriter("c:/fi6");
		Scanner sc6=new Scanner(System.in);
		String str6=null;
		while(!(str6=sc6.nextLine()).equals(""))
			fw6.write(str6+"/r/t");
		fw6.close();
		
		System.out.println("\n  fi5 FileOutputStream");
		FileOutputStream fos=new FileOutputStream("c:/fi5");
		int ch;
		while((ch=System.in.read())!=13)
			fos.write((byte)ch);
		fos.close();
		
		System.out.println("\n  File output Finished");//
		
		System.out.println("\n  fi7 FileCopy");
		FileInputStream fi7=new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fo7=new FileOutputStream("c:/fi7");
		int ch7;
		while((ch7=fi7.read())!=-1) 
			fo7.write((byte)ch7);
		System.out.print("copy end");
		fi7.close();
		fo7.close();
		
		System.out.println("\n  fi8 FileCopy");
		FileInputStream fi8=new FileInputStream(args[0]);
		FileOutputStream fo8=new FileOutputStream(args[1]);
		int ch8;
		while((ch8=fi8.read())!=-1) 
			fo8.write((byte)ch8);
		System.out.print("copy end");
		fi7.close();
		fo7.close();
		
	}

}
