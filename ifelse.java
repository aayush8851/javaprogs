import java.util.*;
public class ifelse {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter your experience");
        int a= sc.nextInt();
        System.out.println("enter your age");
        int b= sc.nextInt();
        if (a>0&&b>35)
        {
            System.out.println("your salaryis 6000");
        } else if (a>0&&b>27&&b<=35) {
            System.out.println("your salaryis 4800");

        } else if (a>0&&b<28) {
            System.out.println("your salaryis 3000");

        }
        else
        {
            System.out.println("your salaryis 2000");
        }

    }
}
