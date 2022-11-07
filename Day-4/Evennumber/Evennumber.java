//Defination :- this list even number java example shows how to find and list even number between 1 to any given number .
//Test case 1 : - 
  input :- printting even number between 1 to 20
    output :- 2 4 6 8 10 12 14 16 18 20
 // Test case 2 :- 
      input :- printting even number between 1 to 10
        output :- 2 4 6 8 10
          
    public class Evennumber {
    public static void main(String[] args) {
        int limit=100;
        System.out.println("printing even number between 1 and "+limit);
        for (limit=0; limit<=100; limit++){
            if (limit%2==0){
                System.out.print(limit+ " ");
            }
        }
    }
}
