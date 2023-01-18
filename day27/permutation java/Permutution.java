   /* Definition :-A permutation is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. 
     For instance, the words 'ABC' and 'BCA' represents two distinct permutation (or arrangements) of a similar three letter word.
     Test case 1:- 
       Input the String :-ABC
         output:-
           ABC
          ACB
          BAC
          BCA
          CBA
          CAB*/
          public class Permutation {
 
      public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1);
    }
 
    /**
     * permutation function
     * @nikita str string to calculate permutation for
     * @nikita l starting index
     * @nikita r end index
     */
    private void permute(String str, int l, int r)
    {
        if (l == r)
        System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }
      **
     * Swap Characters at position
     * @nikita a string value
     * @nikita i position 1
     * @nikita j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
