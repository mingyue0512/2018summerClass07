import java.util.Scanner;

/*大小写字母之间正好相差32 */
public class T05_0705_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input your change alphabet：");
        char c = input.next().charAt(0);
        change(c);
    }

    private static void change(char c) {
        //如果输入的是大写，+32即可得到小写
        if(c>='A' && c<='Z'){
            c+=32;
            System.out.println("您输入的大写字母"+(char)(c-32)+"被转换成了"+c);
        }else if(c>='a' && c<='z'){    //如果输入的是小写，-32即可得大小写
            c-=32;
            System.out.println("您输入的小写字母"+(char)(c+32)+"被转换成了"+c);
        }else{
            System.out.println("输入的字符有误！！");
        }
    }
}
