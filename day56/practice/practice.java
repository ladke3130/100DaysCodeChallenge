/*definition :- find the array using java in accending order using java .
  test case 1:- Enter no. of elements: 5
                  Enter all the elements:
                                         10
                                         60
                                         70
                                         60
                                         80
                     Ascending Order:10,60,60,70,80*/
import java.util.Scanner;
public class Practice 
{
    public static void main(String[] args) 
    {
        int num, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < num - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[num - 1]);
    }
}
