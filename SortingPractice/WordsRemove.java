import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WordsRemove {
    
     public static void main(String[] args) {
          ArrayList<String> a = new ArrayList<String>(); 
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter no. of words : ");
          int n = sc.nextInt();
          for(int i = 0 ; i < n ; i++){
                 String s = sc.next();
                 a.add(s);
          }
         Iterator<String> itr = a.iterator();

         while(itr.hasNext()){
            if(  itr.next().startsWith("a")){
                    String s = itr.next();
                    a.remove(s);
            }
              
           }
            
         };
     }
