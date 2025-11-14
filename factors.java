import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        for (int y=1;y<=n;y++){
//            System.out.print(y + " ");
//        }
        int n= sc.nextInt();
        for (int m=1;m<=n;m++) {
            if (n%m==0) {
                System.out.println(m);
            }
           
        }


    }
}
