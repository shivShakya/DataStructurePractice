import java.util.ArrayList;

class Functions{
       
       public void zerosToEndArray(int [] arr){       
           int nonZeroIndex = 0;

           for(int i = 0 ; i < arr.length ; i++){
              
                if(arr[i] != 0){
                        arr[nonZeroIndex] = arr[i];
                        nonZeroIndex++;
                }
           }

           while(nonZeroIndex < arr.length){
                arr[nonZeroIndex] = 0;
                nonZeroIndex++;
           }
       }

      public ArrayList<Integer>findSubArrayWithGivenSum(int [] arr,int total){
            int i = 0;
            while(i < arr.length){
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    int sum = 0;
                    int j = i;
                    while(j< arr.length && sum < total){
                           sum += arr[j];
                           list.add(arr[j]);
                           j++;
                    }
                   if(total != sum){
                          i++;
                   }else{
                        return list;
                   }
            }
            return null;     
      }
}

public class zerosToEnd{  
     public static void main(String[] args) {
              
         int [] arr = {0,1,2,3,4};

         Functions fn = new Functions();
         /* 
         fn.zerosToEndArray(arr);
         for(int i = 0 ; i < arr.length ; i++){
                System.out.println(arr[i]);
         }
         */
        ArrayList<Integer> list =  fn.findSubArrayWithGivenSum(arr, 8);
        System.out.println(list);

     }
}