/*Definition :- In this program, we need to check whether given singly linked list is a palindrome or not. A palindromic list is the one which is equivalent to the reverse of itself.

Java program to determine whether a singly linked list is the palindrome
The list given in the above figure is a palindrome since it is equivalent to its reverse list, i.e., 1, 2, 3, 2, 1. To check whether a list is a palindrome, 
we traverse the list and check if any element from the starting half doesn't match with any element from the ending half, then we set the variable 
  flag to false and break the loop.

Test case :- 
  output :-Nodes of singly linked list: 
1 2 3 2 1 
Given singly linked list is a palindrome*/
public class PalindromeLL {  
  
    //Represent a node of the singly linked list  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public int size;  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
        //Size will count the number of nodes present in the list  
        size++;  
    }  
  
    //reverseList() will reverse the singly linked list and return the head of the list  
    public Node reverseList(Node temp){  
        Node current = temp;  
        Node prevNode = null, nextNode = null;  
  
       //Swap the previous and next nodes of each node to reverse the direction of the list  
        while(current != null){  
            nextNode = current.next;  
            current.next = prevNode;  
            prevNode = current;  
            current = nextNode;  
        }  
        return prevNode;  
    }  
  
    //isPalindrome() will determine whether given list is palindrome or not.  
    public void isPalindromeLL(){  
        Node current = head;  
        boolean flag = true;  
  
        //Store the mid position of the list  
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);  
  
        //Finds the middle node in given singly linked list  
        for(int i=1; i<mid; i++){  
            current = current.next;  
        }  
  
        //Reverse the list after middle node to end  
        Node revHead = reverseList(current.next);  
  
        //Compare nodes of first half and second half of list  
        while(head != null && revHead != null){  
            if(head.data != revHead.data){  
                flag = false;  
                break;  
            }  
            head = head.next;  
            revHead = revHead.next;  
        }  
  
        if(flag)  
            System.out.println("Given singly linked list is a palindrome");  
        else  
            System.out.println("Given singly linked list is not a palindrome");  
    }  
  
    //display() will display all the nodes present in the list  
        public void display() {  
            //Node current will point to head  
            Node current = head;  
  
            if(head == null) {  
                System.out.println("List is empty");  
                return;  
            }  
            System.out.println("Nodes of singly linked list: ");  
            while(current != null) {  
                //Prints each node by incrementing pointer  
                System.out.print(current.data + " ");  
                current = current.next;  
            }  
            System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        PalindromeLL sList = new PalindromeLL();  
  
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(2);  
        sList.addNode(1);  
  
        sList.display();  
  
        //Checks whether given list is palindrome or not  
        sList.isPalindromeLL();  
    }  
}  
