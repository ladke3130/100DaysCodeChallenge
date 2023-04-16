/*Definition :-An ArrayList can be Sorted by using the sort() method of the Collections Class in Java.
  This sort() method takes the collection to be sorted as the parameter and returns a Collection sorted in the Ascending Order by default.
  Test case :-Unsorted ArrayList: [Geeks, For, ForGeeks, GeeksForGeeks, A computer portal]
Sorted ArrayList in Ascending order : [A computer portal, For, ForGeeks, Geeks, GeeksForGeeks]
*/

import java.util.*;

public class ArrayList12 {
	public static void main(String args[])
	{

		// Get the ArrayList
		ArrayList<String>
			list = new ArrayList<String>();

		// Populate the ArrayList
		list.add("Geeks");
		list.add("For");
		list.add("ForGeeks");
		list.add("GeeksForGeeks");
		list.add("A computer portal");

		// Print the unsorted ArrayList
		System.out.println("Unsorted ArrayList: "
						+ list);

		// Sorting ArrayList in ascending Order
		// using Collection.sort() method
		Collections.sort(list);

		// Print the sorted ArrayList
		System.out.println("Sorted ArrayList "
						+ "in Ascending order : "
						+ list);
	}
}
