/*Definition :-we have counted the number of words, white spaces, vowels, consonants, and characters. 
Sometimes it also becomes necessary to count the total number of punctuations in a string. 
So, in this section, we are going to create a Java program that counts the total number of punctuations in a given string.
Test case :- 
output :-The number of punctuations exists in the string is: 5*/
public class CountPunctuation   
{    
public static void main (String args[])   
{    
//Stores the count of punctuation marks    
int count = 0;    
String str = "He said, 'The mailman loves you.' I heard it with my own ears.";    
for (int i = 0; i < str.length(); i++)   
{    
//Checks whether given character is punctuation mark    
if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
{    
count++;    
}    
}    
System.out.println("The number of punctuations exists in the string is: " +count);    
}    
}    
