/* 
Q - inverted star pattern
* * * * * 
* * * *   
* * *     
* *       
*    
*/ 
import java.util.*;

public class InvertedStarPattern {
    public static void invertedStar(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int n = sc.nextInt();
        invertedStar(n);
        sc.close();
    }
}
