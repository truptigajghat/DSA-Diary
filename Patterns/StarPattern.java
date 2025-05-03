/*
 * Q - Print star pattern
 *      *
 *      * *
 *      * * *
 *      * * * *
*/

import java.util.*;
public class StarPattern {
    public static void star(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int num = sc.nextInt();
        star(num);
        sc.close();
    }
}
