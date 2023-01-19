/*Definition :-Java Object class is the super class of all the Java classes.
  All Java classes implements the Object class by default. 
    The Java Object class provides the two important methods to compare two objects in Java, i.e. equals() and hashCode() method. 
  In this section, we will learn how equals() and hashCode() method works. 
      Test case 1 :-
        Objects are not equal, hence it returns false
Objects are equal, hence it returns true*/

public class ObjectComparison  
{  
public static void main(String[] args)   
{  
//creating constructor of the Double class   
Double x = new Double(123.45555);  
//creating constructor of the Long class   
Long y = new Long(9887544);  
//invoking the equals() method   
System.out.println("Objects are not equal, hence it returns " + x.equals(y));  
System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));  
}  
}  
