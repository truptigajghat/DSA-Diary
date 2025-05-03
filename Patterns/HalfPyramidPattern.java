/*
 PRINT Half pyramid pattern

1 
1 2
1 2 3 
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

 */
import java.util.Scanner;

public class HalfPyramidPattern {
    public static void halfPyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n =  sc.nextInt();
        halfPyramid(n);
        sc.close();
    }
}
