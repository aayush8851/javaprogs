import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int a=0;
int c=1;
int t=0;
        System.out.print(a +" "+ c);
for (int b = 1;b<=m-2;t=b+a){
    t=b+c;
    System.out.print(" " +t);
    b=c;
    c=t;



}

    }
}
