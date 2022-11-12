//Defination :- In fibonacci series ,next number is sum of perious two number for example 0,1,1,2,3,5,8,13,33,55 etc.the first two number fibonacci series are 0 or 1 .
Tes4t case 1:  
//input : n1 = n2
   //     n2= n3
     //   print value= n3 
//output : 0 
         1 
         1
         2
         3
         5
         8
         13
         21
         34
           
  class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
}
  }
