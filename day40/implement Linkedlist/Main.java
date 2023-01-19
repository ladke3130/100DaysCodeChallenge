/*Definition :-In this example, we will learn to implement the linked list data structure in Java.

To understand this example, you should have the knowledge of the following Java programming topics.
  Test case 1 :-
    input :-
    LinkedList: [Cat, Dog, Horse]
    output :-
        First Element: Cat 
        Last Element: Horse*/

import java.util.LinkedList;

class Main {
  public static void main(String[] args){

    // create a linked list using the LinkedList class
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");

    // add element at the beginning of linked list
    animals.addFirst("Cat");

    // add element at the end of linked list
    animals.addLast("Horse");
    System.out.println("LinkedList: " + animals);

    // access first element
    System.out.println("First Element: " + animals.getFirst());

    // access last element
    System.out.println("Last Element: " + animals.getLast());
    }
}
