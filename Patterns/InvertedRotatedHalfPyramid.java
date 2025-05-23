/*
print inverted rotated half pyramid
      * 
     **
    ***
   ****
  *****

 */
import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
    public static void invrtedRotatedPyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        invrtedRotatedPyramid(n);
        sc.close();
    }
}
