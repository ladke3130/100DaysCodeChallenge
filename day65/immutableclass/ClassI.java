/*Definition :-In Java, when we create an object of an immutable class, we cannot change its value.
  For example, String is an immutable class. Hence, we cannot change the content of a string once created.
  Test case :- 
  output :-
  Name: Programiz
Date: 2011*/
// class is declared final
final class Immutable {

  // private class members
  private String name;
  private int date;

  Immutable(String name, int date) {

    // class members are initialized using constructor
    this.name = name;
    this.date = date;
  }

  // getter method returns the copy of class members
  public String getName() {
    return name;
  }

  public int getDate() {
    return date;
  }

}

class ClaasI {
  public static void main(String[] args) {

    // create object of Immutable
    Immutable obj = new Immutable("Programiz", 2011);

    System.out.println("Name: " + obj.getName());
    System.out.println("Date: " + obj.getDate());
  }
}
