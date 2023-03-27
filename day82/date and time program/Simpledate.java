/*Definition:-In this java example the time entered by the user is converted from 24 to 12–hour formats with AM/PM marker. 
Test case :-
Output
Current Time is : Mon Oct 26 08:34:53 UTC 2020
Current Time in AM/PM Format is : 08.34 AM*/
import java.util.Date;
import java.text.SimpleDateFormat;

public class Simpledate {

// Main driver method
	public static void main(String[] args)
	{
		// Getting the current current time
		Date date = new Date();

	
		System.out.println("Current Time is : " + date);

		// set format in 12 hours
		SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
		// hh = hours in 12hr format
		// mm = minutes
		// aa = am/pm

		String time = formatTime.format(
			date); // changing the format of 'date'

		// display time as per format
		System.out.println(
			"Current Time in AM/PM Format is : " + time);
	}
}
