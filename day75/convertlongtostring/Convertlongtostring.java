/*Definition :-Conversion of long type to string type generally comes in need in the 
case when we have to display a long number in GUI application because everything is displayed as string form.

Given a Long number, the task is to convert it into String in Java.
  Test case :-Input:Long = 20L
Output:"20"

Input:Long = 999999999999L
Output:"999999999999"*/
	
public class Convertlongtostring {
	
	// main method
	public static void main(String args[])
	{
	
		// create a Long
		Long varLong = 999999999999L;
	
		// convert into String
		String str = varLong+" ";
	
		// printing the type of str to
		// show that long has been converted to string
		System.out.println("Converted type : "+str.getClass().getName());
	
		// print Long as String
		System.out.println(str);
	}
}
