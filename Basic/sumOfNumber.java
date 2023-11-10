
import java.util.Scanner;

public class sumOfNumber{

         public static int sumNumberExDigits(int n , int d){
                  int sum = 0 ;
                  while(n > 0){
                        
                   int a = n%10;
                     if(a != d){
                        sum += a;
                     }
                     n = n/10;
                  }
                return sum;
         }
         
         public static void main(String[] args){
                
                sumOfNumber s = new sumOfNumber();
                
                Scanner sc = new Scanner(System.in);

                System.out.print("Number : ");
                int n = sc.nextInt();
                System.out.print("Digits : ");
                int d = sc.nextInt();

                int sum = s.sumNumberExDigits(n ,d);

                System.out.println("The sum after excluding " + d + " is " + sum);
        
         }
}