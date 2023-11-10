import java.lang.*;

public class BubbleSort{
     static int[] sort(int arr[]){
          boolean swapped;
          int n = arr.length;
          for( int i = 0 ; i < n-1 ; i++){
                swapped = false ;

                for (int j = 0 ; j < n-i-1 ; j++){
                        if (arr[j]  > arr[j+1]){

                              int temp = arr[j+1];
                               arr[j+1] = arr[j];
                               arr[j] = temp ;

                               swapped = true;
                        }

                }

                 if (swapped == false){
                               break;
                        }
          }

          return arr;

     }

          static void printArray(int arr[]){
                   for(int i = 0; i < arr.length ; i++){
                      System.out.print(arr[i]+ " ");
                   }
          }


          public static void main(String[] args){
                 BubbleSort bb = new BubbleSort();
                 int arr[] = {3,5,9,1,6};
                 bb.sort(arr);
                 bb.printArray(arr);
          }


}