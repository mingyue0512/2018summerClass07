import java.util.Scanner;

/*��Сд��ĸ֮���������32 */
public class T05_0705_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input your change alphabet��");
        char c = input.next().charAt(0);
        change(c);
    }

    private static void change(char c) {
        //���������Ǵ�д��+32���ɵõ�Сд
        if(c>='A' && c<='Z'){
            c+=32;
            System.out.println("������Ĵ�д��ĸ"+(char)(c-32)+"��ת������"+c);
        }else if(c>='a' && c<='z'){    //����������Сд��-32���ɵô�Сд
            c-=32;
            System.out.println("�������Сд��ĸ"+(char)(c+32)+"��ת������"+c);
        }else{
            System.out.println("������ַ����󣡣�");
        }
    }
}
