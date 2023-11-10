public class ReverseWords {

    public static String reverseString(String str){
          String [] strArray = str.split("");
          
          StringBuilder newStr = new StringBuilder();

          for(int i = strArray.length-1 ; i >= 0 ; i--){
                  newStr.append(strArray[i]);
          }
          return newStr.toString();
    }
    

    public static void main(String [] args){          
           String str = "the sky is blue";
           String newStr =  ReverseWords.reverseString(str);
           System.out.println(newStr);
    }
}
