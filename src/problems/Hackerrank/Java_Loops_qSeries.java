package Hackerrank;
/* The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
  
*/

import java.util.Scanner;

class Java_Loops_qSeries{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int c = 0;
            for(int j=0;j<n;j++){                
                if(j == 0){
                    c += (a+Math.pow(2,j)*b);
                }else{
                    c += (Math.pow(2,j)*b);
                }
                
                System.out.print(c+ " ");
            }
            System.out.println();
   
        }
        in.close();
    }
}
