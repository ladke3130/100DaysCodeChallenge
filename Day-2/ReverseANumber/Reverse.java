/*//Test case1:
Input:
Enter any number:123
Output:321
//Test Case2:
Input:
Enter any number:98705
Output:50789Z*/
  
....................................................................................................................................................................
import java.util.Scanner ;
public class Reverse {
    public static void main(String[] args) {
        int no , rev=0,r,a;
        Scanner sc = new Scanner (System. in);
        System.out.print("enter any number : ");
        no = sc.nextInt();
        a= no ;
        while(no >0) {
            r = no %10;
            rev = rev*10+r;
            no = no /10;
        }
        System.out.println("Reverse : " + rev);
    }
    }
