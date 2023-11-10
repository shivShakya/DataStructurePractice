
import java.util.Scanner;

public class Fibonacci{
       public static int [] createFib(int n ){

                int a = 0 ;
                int b = 1;
                
                int arr [] = new int [n];
                arr[0] = a;
                arr[1] = b;
                for(int i = 2 ; i < n ; i= i+1){
                       int c = a + b;
                       arr[i]= c ;
                       a = b ;
                       b = c;
                } 
                return arr;
       }

        public static void main(String[] args){
               
               Scanner sc = new Scanner(System.in);
               System.out.print("Numbers : ");
               int n = sc.nextInt();
               int arr [] = createFib(n);
               
               for(int i = 0 ; i < n ; i++){
                      System.out.print(arr[i]+ " ");
               }
        }
}