//defination :- Converting rows of a matrix into columns and columns of a matrix into row is called transpose of a matrix.
//Test case 1 :-
//  Input :-
Printing Matrix without transpose:
1 3 4 
2 4 3 
3 4 5
//Output :-
Printing Matrix After Transpose:
1 2 3 
3 4 4 
4 3 5 


public class MatrixTranspose{  
public static void main(String args[]){  
//creating a matrix  
int original[][]={{1,3,4},{2,4,3},{3,4,5}};    
    
//creating another matrix to store transpose of a matrix  
int transpose[][]=new int[3][3];  //3 rows and 3 columns  
    
//Code to transpose a matrix  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
transpose[i][j]=original[j][i];  
}    
}   
System.out.println("Printing Matrix without transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(original[i][j]+" ");    
}    
System.out.println();//new line    
}    
System.out.println("Printing Matrix After Transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(transpose[i][j]+" ");    
}    
System.out.println();//new line    
}    
}}   
