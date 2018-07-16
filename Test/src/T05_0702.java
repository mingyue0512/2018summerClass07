
public class T05_0702 {
	
	public static int Test() {
		int a=10;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		int input=2;
		int score=96;
		
		String grade="";
		int num1=10,num2=5,result=0;
		char op='*';
		

		int i = 0, j=1, sum=0;
		char munja= 'a';

	
		System.out.println("\n=====1.if:jishu :oushu");		
		if(input%2==0)
			System.out.println("oushu");
		System.out.println("jishu");
		
		
		System.out.println("\n=====2.if~else:jishu:oushu");	
		input=28;
		if(input%2==0) {
			System.out.println("oushu");
		}
		else {
			System.out.println("jishu");
		}
		
		System.out.println("\n=====3.zongce:grade");		
		if(score>=90) {
			grade="A";
			if(score>=95){
				grade=grade+"+";
			}else if(score<94){
				grade=grade+"-";
			}
		}else if(score>=85){
			grade="B";
			if(score>=85){
				grade=grade+"+";
			}else if(score <84){
				grade=grade+"-";
			}
		}else{
			grade="C";
		}
		System.out.println("grade="+grade);
		
		
		System.out.println("\n=====4.switch:jishu:oushu");		
		switch(input%2) {
		case 0:
			System.out.println("jishu");
			break;
		case 1:
			System.out.println("oushu");
			break;
		}
		
		
		System.out.println("\n====5.switch:jisuanqi");
		switch(op) {
		case'+':
			result=num1+num2;
			System.out.println(num1+"+"+num2+"="+result);
			break;
		case'-':
			result=num1-num2;
			System.out.println(num1+"-"+num2+"="+result);
			break;
		case'*':
			result=num1*num2;
			System.out.println(num1+"*"+num2+"="+result);
			break;
		case'/':
			result=num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
			break;
		default:
			System.out.println("사칙 연산자를 입력해 주세요.");
		}
		
		
		System.out.println("\n====6.for:1~9");
		for(i=0;i<10;i++) {
			System.out.print(i);
		}
	
		
		System.out.println("\n====7.gugudan2~4");
		for(i = 2; i < 5; i++) {
			for(j=1 ; j<10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);				
			}
			System.out.print("\n");
		}
		
		System.out.println("\n====8.while");
		i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("\n====9.gugudan5~9");
		i=5;
		j=1;
		while (i < 10) {
			
			while ( j < 10 ) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			
			i++;
			j=1;
			System.out.print("\n");
		}

		
		System.out.println("\n====10.a~z");
		do {
			System.out.print(munja);
			munja = (char) (munja + 1);		
		} while (munja <= 'z'); 	
		
		System.out.println("\n====11.break test");
		i=0;
		while(true) {
			if(sum==10) break;
			i++;
			sum+=i;
			System.out.print("i="+i);
			System.out.println("sum="+sum);
		}

		System.out.println("\n====12.continue test");
		i=0; sum=0;
		for(i=1;i<=10;i++) {
			if(i%2==1)
				continue;
			else
				sum+=i;
			System.out.print("\t"+i);
		}
		System.out.println("\n1~10oushuhe"+sum);
		
      System.out.println("\n=====13. return test");
      
      System.out.println("return Test:" + Test());
      
     System.out.println("\n\n====14.gugudan");
		for (i = 1; i < 10; i++,System.out.println()) {
			for (j = 1; j < 10; j++,System.out.print('\t')) {
				System.out.print(i + "*" + j + "=" + i*j);
			}
		}

		System.out.println("\n\n15. gugudan");
		for (i = 1; i < 10; i++,System.out.println()) {
			for (j = 1; j < 10; j++,System.out.print('\t')) {
				System.out.print(j + "*" + i + "=" + i*j);
			}
		}	
	}

}