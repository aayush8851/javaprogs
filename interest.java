import java.util.*;

public class interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("enter amount");
        int p=sc.nextInt();
        System.out.println("enter interest");
        int r=sc.nextInt();
        System.out.println("enter time");
        int t=sc.nextInt();
        float a=(p*r*t)/100;
        System.out.println(a);

         */
        /*campound interest


    */
        System.out.println("enter amount");
        int p=sc.nextInt();
        System.out.println("enter amount");
        int r=sc.nextInt();
        System.out.println("enter amount");
        int t= sc.nextInt();
       double b= 1+r/100.0;
      double c= Math.pow(b,t);

        double a= (p*c)-p;
        System.out.println(a);





    }
}
