import java.io.*;
import java.util.Scanner;


class Bicycle {
	boolean frontWheel;
	boolean rearWheel;
	boolean leftBrake;
	boolean rightBrake;
	int gear;

	void gearUp()     { gear++; }
	void gearDown() { gear--; }  
	void frontStop() { leftBrake = false; }
	void rearStop()  { rightBrake = false; }	
}
public class T05_0703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String scoreName[]= {"aa","bb","cc","dd","ee"};
		
		int[][] intArray= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};

		int intArray21[][] = new int[4][];
		intArray21[0] = new int[3];
		intArray21[1] = new int[2];
		intArray21[2] = new int[3];
		intArray21[3] = new int[2];
		
		int input=0;
				
		System.out.println("\n****1.score");	
		int[] score= {100,90,80,70,60,50};
		System.out.println("size:"+score.length);
		for(int i=0;i<6;i++) {
			System.out.println(score[i]);
		}
		
		System.out.println("\n****2.for-each:score");		
	    for(int i:score) {
	    	System.out.println(i);
	    }
	    
	    System.out.println("\n****3.for-each:scoreName");		
	    for(String s:scoreName) {
	    	System.out.println(s);
	    }
	    
	    System.out.println("\n****4.2D array output");
	    for(int i=0; i<intArray.length;i++) {
	    	for(int k=0; k<intArray[i].length;k++) {
	    		System.out.println("intArray["+i+"]["+k+"]="+intArray[i][k]);
	    	}
	    }
	    System.out.println("\n****5-1. adjustable Input");
		System.out.println("intArray21.length:"+intArray21.length);
		System.out.println("intArray21[0].length:"+intArray21[0].length);
		System.out.println("intArray21[1].length:"+intArray21[1].length);
		System.out.println("intArray21[2].length:"+intArray21[2].length);
		
		for (int i = 0; i < intArray21.length; i++)
			for (int j = 0; j < intArray21[i].length; j++)
				intArray21[i][j] = (i+1)*10 + j;
		
		System.out.println("\n****5-2. adjustable output");
		for (int i = 0; i < intArray21.length; i++) {
			for (int j = 0; j < intArray21[i].length; j++)
				System.out.print(intArray21[i][j]+" ");
			System.out.println();
		}
	    
	    System.out.println("\n****6. argument output");		
		System.out.println("parameter's counts : "+ args.length + "개");
		System.out.println("1. args.length ");		
		//System.out.println(args.length);
		for(String i : args) {
			System.out.println(i);
		}
	    System.out.println("\n****8.Scanner name id input");
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Input name and id: ");
	    System.out.println("name="+scan.next());
	    System.out.println("id="+scan.nextInt());
	    
	    System.out.println("\n****7.inputStreamReader");
	    InputStreamReader rd=new InputStreamReader(System.in);
		try {
			while(true) {
				input = rd.read();
				
				if(input==-1){	
					break;
				}
				System.out.println((char)input);
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("excepion");
		}
		

		System.out.println("\n****9. try-chtch 발생");		
		try {
			Exception e = new Exception("일부러 발생한예외");
			throw e;
		} catch (Exception e) {
			System.out.println("에러 메세지: "+ e.getMessage());		
			e.printStackTrace();
		}
		System.out.println("프로그램 잘 끝넀음");

		Bicycle yueBy = new Bicycle(); 
		System.out.println("현재의 기어는 "+ yueBy.gear);
		yueBy.gear = 3;
		yueBy.gearUp();
		System.out.println("현재의 기어는 "+ yueBy.gear);
				
		
				/*try {
					input = rd.read();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println( (char)input);			
				
		*/		
    }
}
