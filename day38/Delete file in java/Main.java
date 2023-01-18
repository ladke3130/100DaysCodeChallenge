//Definition :-In this example, we will learn to delete file in using the File and Files class in Java.

//To understand this example, you should have the knowledge of the following Java programming topics:

//Java if...else Statement
import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("JavaFile.java");

    // deletes the file
    boolean value = file.delete();
    if(value) {
      System.out.println("JavaFile.java is successfully deleted.");
    }
    else {
      System.out.println("File doesn't exit");
    }
