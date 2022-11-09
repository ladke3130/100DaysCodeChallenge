Definition :- this program shows how to determine whether the given year is leap year or not .
  test case 1:
input : 2016
  output: 2016 is leapyear 
  test case 2 :
input: 2019
  output: 2019 is not leap year
  
public class leap {
  public static void main(String[] args) {
    int year = 1900;
    boolean leap = false;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }}

