//Defination:-Prime number is a number that is grether then 1 and divided by 1 or itself .
//In other world ,prime number can not be divided by other number then itself or 1 . for example 2,3,5,7,11,13,17..........are the prime number.

//Test case 1: 
//input :number is 19 
 //output:- number is prime 
//Test case 2: 
//input:- number is 17 
 // output : number is prime 

public class Primenumber{
    public static void main(String[] args) {
        int i , m =0 , flag =0;
        int n=17;
        m=n /2;
        for (i=2; i<=m; i++){
            if ( n%i==0){
                System.out.println("number is not prime");
                flag =1;
                break;
            }
        }
        if(flag ==0)
        System.out.println("number is prime");
    }
}
