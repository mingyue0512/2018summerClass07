

import java.util.Scanner;

public class T05_0705_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner input = new Scanner(System.in);
		int num,num1,num2;
		int array[][]= {{0,0,0,0,0,0,1,0,0},
						{1,1,1,1,0,0,1,0,0},
						{0,0,0,0,0,0,1,0,0},
						{0,0,0,0,0,0,1,0,0},
						{0,0,0,0,0,0,0,0,0},
						{1,1,0,1,0,0,0,0,0},
						{0,0,0,1,0,0,0,0,0},
						{0,0,0,1,0,0,0,0,0},
						{0,0,0,0,0,1,1,1,0},
						};
		char biaoge[][]=new char[10][10];
		biaoge[0][0]=' ';
		for(i=1;i<10;i++) {
			biaoge[0][i]=(char)(i+48);
		}
		for(i=1;i<10;i++) {
			biaoge[i][0]=(char)(i+48);
		}
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				System.out.print(" "+biaoge[i][j]);
			}
			System.out.println();
		}
		System.out.println("input");
		
		while(true) {
			num=input.nextInt();
			num1=(int)(num/10);
			num2=num%10;
			if(num==0)
				break;
			if(array[num1-1][num2-1]==0)
				biaoge[num1][num2]='x';
			else 
				biaoge[num1][num2]='o';
			for(i=0;i<10;i++) {
				for(j=0;j<10;j++) {
					System.out.print(" "+biaoge[i][j]);
				}
				System.out.println();
			}
		}
		System.out.println("³É¹¦ÍË³ö");
	}

}
 
