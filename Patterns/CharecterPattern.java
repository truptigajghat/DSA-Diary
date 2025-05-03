/* 
print charecter pattern 
A 
B C     
D E F   
G H I J 
K L M N O
 */

import java.util.Scanner;

public class CharecterPattern {
    public static void Charecter(int n) {
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n =  sc.nextInt();
        Charecter(n);
        sc.close();

    }
}
