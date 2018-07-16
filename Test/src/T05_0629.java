
public class T05_0629 {

	public static void main(String[] args) {
		
		
		final int MAX= 1000;
		int score=100;
		char ch='A';
		String hi = "hello";
		
		
		double FtoD=3.0f;
		//float DtoF=5.1;
		byte byteDefault=0;
		float testFloat=0.0f;
		String testString="05 金明月";
		float typeFloat=1.6f;
		int testInt=(int)typeFloat;
		int toChar = 65;
		char fromInt = (char)toChar;
		int castInt = 300;
		byte fromIntToB=(byte)castInt;
		
		
		int i=5;
		int j=0;
		int  unaryOp=5;
		int signOp=-10;
		boolean power=false;
		int bitOp=10;
		int a =10;
		int b =3;
		float c =10;
		float d=3;
		char ch1='\u0041';
		char ch2 = ' ';
		int share = 10/8;
		int remain=10%8;
		j=i++;


		System.out.println("===== 01");
		System.out.println(" score :"+score);
		System.out.println(" ch    :"+ch);
		System.out.println(" hi    :"+hi);
		score=200;
		System.out.println(" after score :"+score);
		System.out.println(" MAX         :"+MAX);
		//MAX=2000;
		System.out.println("===== 02");
		System.out.println(" FtoD :"+FtoD);
		//System.out.println(" DtoF :"+DtoF);
		System.out.println(" byteDefault :"+byteDefault);
		System.out.println(" testFloat   :"+testFloat);
		System.out.println(" testString  :"+testString);
		System.out.println(" typeFloat   :"+typeFloat);
		System.out.println(" test float to int :"+testInt);
		System.out.println(" test int to char  :"+fromInt);
		System.out.println(" test int to byte  :"+fromIntToB);
		System.out.println("===== 03");
		System.out.println("after j = i++ : i ="+ i +", j = "+j);
		i = 5;
		j=++i;
		System.out.println("after j = ++i : i ="+ i +", j = "+j);
		System.out.println("===== 04 extra");
		System.out.println("after unaryOp++ : "+ unaryOp++);
		System.out.println("after ++unaryOp : "+ ++unaryOp);
		unaryOp=5;
		unaryOp++;
		System.out.println("after unaryOp++ : "+ unaryOp);
		++unaryOp;
		System.out.println("after ++unaryOp : "+ unaryOp);
		System.out.println("===== 05 符号运算符");
		signOp=+signOp;
		System.out.println("after + signOp : "+ signOp);
		signOp=-signOp;
		System.out.println("after - signOp : "+ signOp);
		System.out.println("===== 06 逻辑运算符");
		System.out.println("after  power = ！power "+ (power =! power));
		System.out.println("after  power = ！power "+ (power =! power));
		System.out.println("===== 07 位运算符");
		System.out.println("bitOp  : "+ bitOp);
		System.out.println("~bitOp : "+ ~bitOp);
		System.out.println("===== 08 位运算符");
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		System.out.println("c : "+ c);
		System.out.println("d : "+ d);
		System.out.println("a/b : "+ a/b);
		System.out.println("c/d : "+ c/d);
		System.out.println("a/d : "+ a/d);
		System.out.println("10/8 : "+ share);
		System.out.println("10%8 : "+ remain);
		System.out.println("ch1 : "+ ch1);
		System.out.println("ch2 : "+ ('A'+1));
		ch2=(char)(ch1+1);
		System.out.println("ch2 : "+ ch2);
		j = 'B' - 'A';
		System.out.println("B - A : "+ ('B' - 'A'));//j
		System.out.println("8<<1 : "+ (8<<1));
		System.out.println("7>>1 : "+ (7>>1));
		System.out.println("===== 09 位运算符");
		i=12;
		j=6;
		System.out.println("i & j : "+ (i&j));
		System.out.println("i | j : "+ (i|j));
		System.out.println("i ^ j : "+ (i^j));
		System.out.println("===== 10 逻辑运算符");
		System.out.println("true || true   :"+ (true || true));
		System.out.println("true || false  :"+ (true || false));
		System.out.println("false || false :"+ (false || false));
		System.out.println("true && true   :"+ (true && true));
		System.out.println("true && false  :"+ (true && false));
		System.out.println("false && false :"+ (false && false));
		System.out.println("===== 11 三目运算符");
		String pass = (i >= 10 ? "合格":"不合格");
		System.out.println(pass);
				
	}

}