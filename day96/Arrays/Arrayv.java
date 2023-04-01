/*Definition :-We can tOGGLE each word of a string by the help of split(), toLowerCase(), toUpperCase() and substring() methods. 
  By the help of split("\\s") method, we can get all words in an array. To get the first character, we can use substring() or charAt() method.
  Test case :-
    output:
Enter the number:
6
  after output:
1
1
1
2
2
2*/
import java.util.Scanner;
public class Arrayv{
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b[] = new boolean[n+1];
        for(int i=1; i<=n; i++ )
        {
            b[i]=true;
        }
        for(int i=2; i<=n; i=i+2){
            b[i]=false;
        }
        for(int i=3; i<=n; i++){
            for(int j=i;j<=n; j=j+i){
                b[j]=b[i]? false:true;
            }
        }
        for(int i=1; i<=n; i++){
            if(b[i]){
                count++;
            }
            System.out.println(count);
        }
    }}
    
