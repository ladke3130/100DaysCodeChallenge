/*Definition :-
  Transpose of a matrix can be found by interchanging rows with the column that is, 
rows of the original matrix will become columns of the new matrix. Similarly, 
columns in the original matrix will become rows in the new matrix. The operation can be represented as follows:
Test case :-
  input the matrix :-[1 2 3]
                      4 5 6
                      7 8 9
    transpose of the matrix :-[1 4 7]*/
                               2 5 8 
                               3 6 9
                               

Java Program to find the transpose of a given matrix

public class Transpose    
{    
    public static void main(String[] args) {    
        int rows, cols;    
            
        //Initialize matrix a    
          int a[][] = {    
                          {1, 2, 3},    
                          {4, 5, 6},    
                          {7, 8, 9}    
                       };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
        //Declare array t with reverse dimensions    
        int t[][] = new int[cols][rows]; 
      
           for(int i = 0; i < cols; i++){    
            for(int j = 0; j < rows; j++){    
                //Converts the row of original matrix into column of transposed matrix    
                t[i][j] = a[j][i];    
            }    
        }    
        
        System.out.println("Transpose of given matrix: ");    
        for(int i = 0; i < cols; i++){    
            for(int j = 0; j < rows; j++){    
               System.out.print(t[i][j] + " ");    
            }    
            System.out.println();    
        }    
    }    
}
