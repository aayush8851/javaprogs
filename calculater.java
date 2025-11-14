// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class calculater {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("welcome in calculater");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        switch (b)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid corde 000");
        }
    }
}
