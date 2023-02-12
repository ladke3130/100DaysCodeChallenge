/*Definition :- find the value of valume of cylinder using java.
  Test case :- 
    Enter the radius:
3
Enter the height:
6
volume of Cylinder is: 169.71428571428572*/
import java.util.Scanner;
class VolumeOfCylinder 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
                                double r=s.nextDouble();
         System.out.println("Enter the height:");
                                double h=s.nextDouble();
 
                                double  volume=((22*r*r*h)/7); 
         System.out.println("volume of Cylinder is: " +volume);
             
    } 
}
