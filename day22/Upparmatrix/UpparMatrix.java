//Definition :-   Upper triangular matrix is a square matrix in which all the elements below the principle diagonal are zero. 
 // To find the upper triangular matrix, a matrix needs to be a square matrix that is,
//the number of rows and columns in the matrix need to be equal. Dimensions of a typical square matrix can be represented by n x n.
//Test case :-
  //Output :-
//Upper triangular matrix:
1	2   3
0    6   4
0    0   0

public class UpparMatrix    
{    
    public static void main(String[] args) {    
        int rows, cols;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {1, 2, 3},    
                        {8, 6, 4},    
                        {4, 5, 6}    
                    };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length; 
          cols = a[0].length;    
            
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
            //Performs required operation to convert given matrix into upper triangular matrix    
            System.out.println("Upper triangular matrix: ");    
            for(int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++){    
                  if(i > j)    
                    System.out.print("0 ");    
                  else    
                    System.out.print(a[i][j] + " ");    
                }    
                System.out.println(); 
            }}}}
