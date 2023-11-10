public class InsertionSort{

        
          void sort(int arr[]){
                int n = arr.length;

              for(int i = 0 ; i < n ; i++){  
                int key  = arr[i];
                 
                int j = i -1 ;

                while ( j >= 0 && arr[j] > key){
                        arr[j+1] = arr[j];
                        j = j - 1; 
                }

                arr[j+1] = key ;
          }
        }


        static void printArray(int arr[]){
               for(int i = 0 ; i < arr.length ; i++){
                     System.out.print(arr[i]+" ");
               }
        }



        public static void main(String[] args){
               InsertionSort is = new InsertionSort();
               int arr[] = {2,6,1,9,4};
               is.sort(arr);
               is.printArray(arr);
        }



}