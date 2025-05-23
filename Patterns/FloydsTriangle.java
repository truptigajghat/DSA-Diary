/*
Q print floyd's triangle
    1 
    2 3
    4 5 6
    7 8 9 10
   11 12 13 14 15
 */
import java.util.Scanner;

public class FloydsTriangle {
    public static void floydTriangle(int n) {
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number of rows");
        int n =  sc.nextInt();
        floydTriangle(n);
        sc.close();
    }
}
