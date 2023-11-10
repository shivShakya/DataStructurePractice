public class Reverse{
       
       public int [] reverse(int arr []){
               int n = arr.length;
               int revArr [] = new int[n];
               int a = n;
               for(int i = 0 ; i < n ; i++){
                      revArr[a-1] = arr[i];
                      a --;
               }

               return revArr;
       }

       public void displayReverseArray(int revArr []){
                 
               for(int i = 0 ; i < revArr.length ; i++){
                         System.out.print(revArr[i]);
               }
       }


        public static void main(String[] args){
             
             int arr [] = {2,5,8,9,1,23,12,34,56};

             Reverse rs = new Reverse();
             int[] revArr =  rs.reverse(arr);

             rs.displayReverseArray(revArr);
       }
}

