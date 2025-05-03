/*
print hollow rectangle pattern
* * * * * * * * 
*             * 
*             *
* * * * * * * * 
 */

import java.util.Scanner;

public class HollowRectangle {
    public static void hollowRectangle(int n, int m){
        for(int i=1; i<=n; i++){
           for(int j=1; j<=m; j++){
            if(i==1 || i==n || j==1 || j==m){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m =  sc.nextInt();
        hollowRectangle(n, m);
        sc.close();
    }
}
