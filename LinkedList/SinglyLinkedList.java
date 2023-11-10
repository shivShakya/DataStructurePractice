public class SinglyLinkedList{

    class Node {
            int data;
            Node next;

            public Node(int data){
                  this.data = data;
                  this.next = null;
            }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
             Node newNode = new Node(data);

             if(head == null){
                   head = newNode;
                   tail = newNode;
             }else{   
                  tail.next = newNode;
                  tail = newNode ;
             }
    }

    public int countNodes(){
           int count = 0 ;
           Node current = head;
           while(current != null){
               count++ ;
               current = current.next;
           }

           return count;
    }

    public Node reverse(Node head){

            if(head == null || head.next == null)
                   return head;


             Node c = head;
             Node p = null;
             Node n = head;

             while(c != null){
                  n = n.next;
                  c.next = p;
                  p = c;
                  c = n ;          
             }
             return p ;         
    }

    public Node deleteAtBegin(Node head){

         Node current = head.next ;
         head.next = null;

         return current;
    }

    public Node deleteAtMiddle(Node head){
          int count = countNodes();
          Node c = head;
          Node p = null;

          if(count == 1){
              head = null;
              return head;
          }

          int middle = (count%2 == 0)?(count/2):((count/2)+1);

          int flag = 1;
          while(flag < middle){
                 p = c;
                 c = c.next;
                 flag++;
          }

          if(p != null)
                 p.next = c.next;
          else
                 head = c.next;

          c.next = null;

          return head;
    }

    public Node deleteAtEnd(Node head){
       Node current  = head;

       if(head.next == null){
                return null;
       }
       while(current.next.next != null){
                 current = current.next;
       }
       current.next = null;
       return head;
    }

    public void display(){
            Node current = head;

            if ( head  == null){
                   System.out.println("List is empty !");
                   return ;
            }

            System.out.println("Nodes of singly linked list : ");
            while(current != null){
                    System.out.print(current.data + " ");
                    current = current.next;
            }
          System.out.println();
    }

    public static void main(String[] args){
           

           SinglyLinkedList sList = new SinglyLinkedList();

           sList.addNode(1);
           sList.addNode(2);
           sList.addNode(3);
           sList.addNode(4);
           sList.addNode(5);
           sList.addNode(8);

           sList.display();

           int count = sList.countNodes();
           System.out.println(count);

           System.out.println("Reverse");
           Node reversedList = sList.reverse(sList.head);
           sList.head = reversedList;
           sList.display();

           System.out.println("Delete at begin");
           Node delNode = sList.deleteAtBegin(reversedList);
           sList.head = delNode;
           sList.display();

           System.out.println("Delete at middle");
           Node delMidNode = sList.deleteAtMiddle(reversedList);
           sList.head = delMidNode;
           sList.display();
           
           System.out.println("Delete at end: ");
           Node delEndNode = sList.deleteAtEnd(delMidNode);
           sList.head =delEndNode;
           sList.display();
    }


}