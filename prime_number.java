import java.util.*;
public class prime_number {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int i;
for (i=2;i<a;i++){
  if (a%i==0){
      System.out.println("a is not a prime number");
break;
  }

}
 if (i==a) {
     System.out.println("a is a prime number");
 }
