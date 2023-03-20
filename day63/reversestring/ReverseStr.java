/*Definition :-In this program, you'll learn to reverse a given sentence using a recursive loop in Java.
Test case :- 
output :-
The reversed sentence is: krow oG*/

public class ReverseStr {

  public static void main(String[] args) {
    String sentence = "Go work";
    String reversed = reverse(sentence);
    System.out.println("The reversed sentence is: " + reversed);
  }

  public static String reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
