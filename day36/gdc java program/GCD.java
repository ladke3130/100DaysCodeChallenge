/*Definition :-In this program, you'll learn to find the GCD (Greatest Common Divisor) or HCF using a recursive function in Java.
  test case 1 :
G.C.D of 366 and 60 is 6.*/
public class GCD {

    public static void main(String[] args) {
        int n1 = 366, n2 = 60;
        int hcf = hcf(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}
