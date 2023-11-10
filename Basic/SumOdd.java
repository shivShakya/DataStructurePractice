public class  SumOdd{
        
       
      public static int SumOddIntegers(int arr[] , int n){
                 int sum = 0;
                 for(int i = 0 ; i < n ; i++){
                        if(arr[i]> 0){
                                if(arr[i]%2 != 0){
                                      sum += arr[i]; 
                                }
                        }
                 }
                 return sum;
      }

        public static void main(String[] args){
                  int arr[] = {2,5,1,9,6,-1,4,8,9};
                  int sum = SumOddIntegers(arr,9);      
                  System.out.println(sum);

        }
}