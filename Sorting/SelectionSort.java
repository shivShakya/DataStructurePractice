import java.lang.*;
import java.io.*;

public class SelectionSort{
         
         void sort(int arr[]){
                
                int min = 0 ;

                for(int i = 0 ; i < arr.length-1 ; i++){
                       
                       int min_indx = i ;

                       for(int j = i + 1 ; j< arr.length ; j++){
                            if (arr[j] < arr[min_indx]){
                                  min_indx = j;
                            }
                       }

                       int temp = arr[min_indx];
                       arr[min_indx] = arr[i];
                       arr[i] = temp;
                }
         }

         void printArray(int arr[]){
                for(int i = 0 ; i < arr.length ; i++){
                       System.out.print(arr[i]+ " ");
                }
         }

         public static void main(String[] args){
                SelectionSort ob = new SelectionSort();
                int arr[] = {23,56,12,45,9,34};
                ob.sort(arr);
                ob.printArray(arr );
         }
}