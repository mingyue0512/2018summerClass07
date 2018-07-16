import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.IIOException;

//15103019  김명월
public class T05_0709_1 {
	static String fname="c:\\test";
	static class address{
		String name;
		String age;
		String phone;
		address(String s1,String s2,String s3){
			this.name=s1;
			this.name=s2;
			this.name=s3;
		}
	}
	
	public static void main(String[] args) throws IIOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String select="";
		System.out.printf("\n###친구 연락처 관리###\n");
		while(select!="4") {
			print_menu();
			select=sc.next();
			switch(sc.nextByte()) {
			case 1:
				view_juso();
				break;
			case 2:
				add_juso();
				break;
			case 3:
				delete_juso();
				break;
			case 4:
				return;
			default:
				System.out.printf("\n###잘못입력 다시선택###\n");
			}
			
			static void print_menu() {
				System.out.printf("\n");
				Scanner scan=new Scanner(System.in);
				System.out.printf("1.연락처 출력\n");
				System.out.printf("2.연락처 등록\n");
				System.out.printf("3.연락처 삭체\n");
				System.out.printf("4.끝내기\n");
			}
			
		
			static void view_juso() throws IOException{
				String str="";
				
				
				File f=new File(fname);
				if(!f exists()) {
					BufferedWriter bw=new BufferedWriter(new FileWriter(fname));
					bw.close();
				}
				BufferedReader bc=new BufferedReader(new FileReader(fname));
				int i;
				
				
				for(I=1;;I++);
				{
					if(!br.ready())
						break;
					else {
						  str=br.readLine();
						  System.out.printf("%2d:  %s\n",i,str);
					}
				}
				
				
				if(i==1)
					System.out.printf("\n###연락처 파일에 전화번호가 하나도 없어요###\n");
				br.close();
			}
           
            static void add_juso() throws IOException{
				Scanner sc=new Scanner(System.in);
				address adr=new address("","","");
				String wstr="";
				BufferedWriter bw=new BufferedWriter(new FileWriter(fname,true));
				System.out.printf("이름을 입력==>");
				adr.name=sc.nextLine();
				System.out.printf("나이를 입력==>");
				adr.age=sc.nextLine();
				System.out.printf("전화번호를 입력==>");
				adr.phone=sc.nextLine();
				
				wstr=adr.name+"\t"+adr.age+"\t"+adr.phone;
				bw.write(wstr);//
				bw.newLine();
				bw.close();
			}
            
            
            static void delete_juso() throws IOException{
				Scanner sc=new Scanner(System.in);
				String[] read_str=new String[50];
				String str="";
				int de_line,i,count=0;
				BufferedReader br=new BufferedReader(new FileReader(fname));
				
				if(!br.ready()) {
					System.out.printf("\n연락처 파일이 없습니다\n");
					return;
				}
				System.out.printf("\n삭제할 행 번호는?\n");
				del_line=sc.nextInt();
				for(i=0;i<50;i++) {
					if((str=br.readLine())==null)
							break;
					if(i+1!=del_line)
					{
						read_str[count]=str;
						count++;
					}else
						System.out.printf("%d행ㅇ; 삭제되였습니다.");
				}
				br.close();
				
				BufferedWriter bw=new BufferedWriter(new FileWriter(fname));
				for(i=0;i<count;i++) {
					bw.write(read,str[i]);
					bw.newLine();
				}
				bw.close();
			}
		}
	}
	private static void add_juso() {
		// TODO Auto-generated method stub
		
	}
	private static void delete_juso() {
		// TODO Auto-generated method stub
		
	}
	private static void view_juso() {
		// TODO Auto-generated method stub
		
	}
	private static void print_menu() {
		// TODO Auto-generated method stub
		
	}

}
