class Node{
       
      int data;
      Node left;
      Node right;

      public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
      }
}

public class LevelOfTree{

       public Node createBinaryTree(int arr []){
           Node current;
           Node newNode = new Node(arr[0]);
           current = newNode;
           int i = 1;  
           while(arr[i] != -1){
                Node node = new Node(arr[i]);
                 current.left = node;
                 current = node;  
                 i++; 
           }
           
           int j = i + 1;

           if(arr[j] == -1){
               current.
           }

           while(arr[j] != -1){
                Node node = new Node(arr[j]);
                current.right = node;
                current = node;
                j++;
           }
           



           return null;
       }
      

        public static void main(String [] args){

             int arr [] = {2,3,5,1,-1,-1,-1,6,-1,3,-1,-1,4,-1,7,8,-1};



                
        }
}