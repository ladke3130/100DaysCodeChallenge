/*Definition:-A linear data structure used to store the elements in contiguous locations is called a Linked List in Java. 
  It has addresses and pointers that are used to link the elements,
and each element in the linked list consists of two parts, namely the data part and the address part.
  Test case 1:- 
   insert at end to stop enter -1
3
5
-1
insert at front to stop enter 0
2
0
Linked List
2-->3-->5-->NULL
after deletion at front
3-->5-->NULL
after deletion at end
3-->NULL  ,,,*/

import java.util.Scanner;

public class LinkedList {
}
class Node{
    int data;
    Node next=null,head=null,tail=null,temp=null;
    Node(int val){
        data=val;
        next=null;
    }
    Node(){

    }
    void insertEnd(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            tail.next=new_node;
            tail=new_node;
        }
    }
    void insertFront(int d){
        Node n1 = new Node(d);
        if (head == null) {
            head = n1;
            return;
          }
        n1.next = head;
        head = n1;
    }
    void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");

    }
    void deleteFront(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node last=head;
        Node secondlast =head.next;
        while(secondlast.next !=null){
            secondlast = secondlast.next;
            last=last.next;
        }
        last.next=null;

    }

    public static void main(String[] args) {
        Node node= new Node(10);
        Scanner s=new Scanner(System.in);
        System.out.println("insert at end to stop enter -1");
        int n=s.nextInt();
        while(n!=-1){
            node.insertEnd(n);
            n=s.nextInt();
        }
        System.out.println("insert at front to stop enter 0");
        int x=s.nextInt();
        while(x!=0){
            node.insertFront(x);
            x=s.nextInt();
        }

        System.out.println("Linked List");
        node.print();
        /*while(node.head!=null){
            node.delete();
            node.head=node.next;
        }*/
        System.out.println("after deletion at front");
        node.deleteFront();
        node.print();
        node.deleteLast();
        System.out.println("after deletion at end");
        node.print();
    }
}
