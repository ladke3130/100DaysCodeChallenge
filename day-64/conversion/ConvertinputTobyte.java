/*Definition :-In this example, we will learn to convert an input stream into the byte array in Java.
Test case :-
output :-Input Stream: java.io.ByteArrayInputStream@27082746
Byte Array: [1, 2, 3, 4]*/
import java.io.InputStream;
import java.util.Arrays;
import java.io.ByteArrayInputStream;


public class ConvertinputTobyte{

  public static void main(String args[]) {

    try {

      // create an input stream
      byte[] input = {1, 2, 3, 4};
      InputStream stream = new ByteArrayInputStream(input);
      System.out.println("Input Stream: " + stream);

      // convert the input stream to byte array
      byte[] array = stream.readAllBytes();
      System.out.println("Byte Array: " + Arrays.toString(array));

      stream.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
