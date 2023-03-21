/*Definition:given a string str, write a Java program to print all words with even length in the given string. Examples:

Input: s = "This is a java language"
Output: This
        is
        java
        language 

Input: s = "i am GFG"
output :am*/
class EvenLe{
public static void printWords(String s)
{

// Splits Str into all possible tokens
for (String word : s.split(" "))

// if length is even
if (word.length() % 2 == 0)

	// Print the word
	System.out.println(word);
}

// Driver Code
public static void main(String[] args)
{

String s = "i am Geeks for Geeks and a Geek";
printWords(s);
}
}
