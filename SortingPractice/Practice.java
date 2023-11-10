import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
class Function{  
     public int longestSubSequence(int [] nums){          
            
        int max_seq_length = 0;

        for(int i = 0 ; i < nums.length ; i++){
              
                int curr_num = nums[i];
                int curr_seq_length = 1;
                while(isNumberExist(nums, curr_num+1)){
                        curr_num += 1;
                        curr_seq_length += 1;
                }
                max_seq_length = Math.max(max_seq_length,curr_seq_length);
        }

        return max_seq_length;
     }   
     
     private boolean isNumberExist(int [] arr , int num){
           
            for(int i = 0 ; i < arr.length ; i++){
                   if(arr[i] == num){
                        return true;
                   }
            }
            return false;
     }


     public int anotherLongestSubSeq(int [] nums){
            
         int max_seq_length = 0;

         HashSet<Integer>numSet = new HashSet<Integer>();

         for(int num : nums){
              numSet.add(num);
         }

         for(int i = 0 ; i < nums.length ; i++){
                int cur_num = nums[i];
                int cur_seq_length = 1;
              if(!numSet.contains(cur_num-1)){
                while(numSet.contains(cur_num+1)){
                       cur_num += 1;
                       cur_seq_length +=1;
                }
              }
                max_seq_length = Math.max(max_seq_length,cur_seq_length);
         }
         return max_seq_length;
     }


     public int ArraySum(int [] nums){
           int sum = 0 ;
           for(int i = 0 ; i < nums.length ; i++){
                   sum += nums[i];
           }
           return sum;
     }

     public int LargestElement(int [] nums){
            int max = nums[0];

            for(int i = 1 ; i < nums.length ; i++){
                    if(nums[i] > max){
                         max = nums[i];
                    }
            }
            return max;
     }

     public ArrayList<Integer> ArrayRotate(int [] nums , int k){
               ArrayList<Integer> list = new ArrayList<Integer>();   
               for(int i = k+1 ; i < nums.length ; i++){
                       list.add(nums[i]);
               }
               for(int i = 0 ; i <= k ; i++){
                        list.add(nums[i]);
               }
               return list;
     }


     public ArrayList<Integer>duplicateNumbers(int [] nums){
                 ArrayList<Integer> list  = new ArrayList<Integer>();

                for(int i = 0 ; i < nums.length ; i++){
                       
                      for(int j = i ; j < nums.length ; j++){
                               if(nums[i] == nums[j]){
                                       list.add(nums[i]);
                               }
                      }
                }

                return list;
     } 


     public String subStringPal(String str){
              
            String substring = "";
           HashMap<Integer,String> map = new HashMap<Integer,String>();

            for(int i = 0 ; i < str.length() ; i++){
                   substring += str.charAt(i);
                   
                if(i > 0){
                   if(isPalidrome(substring)){
                           map.put(substring.length(), substring);
                   }
                }
            }
           int maxKey = Collections.max(map.keySet());
           return map.get(maxKey);
     }



    private boolean isPalidrome(String str){      
           
        String revStr = "";
        for(int i = str.length()-1 ; i >= 0; i--){
                revStr += str.charAt(i);
        }
        if(revStr.equals(str)){
                  return true;
        }else{
                  return false;
        }
    }

    public String removeWords(String str){
           String strs = str.toLowerCase();

           String[] strArray = strs.split(" ");        
           for(int i = 0 ; i < strArray.length ; i++){
                   System.out.println(strArray[i]);
           }


          for(int i = 0 ; i < strArray.length ; i++){
                 System.out.println(strArray[i]);
          }
           String newString = "";
           for(int i = 0 ; i < strArray.length ; i++){
                  newString += strArray[i];
           }

           return newString;
    }
}

public class Practice {
      public static void main(String[] args) {
          Function fn = new Function();
         // int [] nums = {3,1,8,2,4,9};
         //System.out.println(fn.ArraySum(nums));
         //ArrayList<Integer> list =fn.ArrayRotate(nums, 1);
        // System.out.println(list);
        String str = " aman ram keem avaj";

        System.out.println(fn.removeWords(str));
        
      }
}
