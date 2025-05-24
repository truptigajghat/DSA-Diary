import java.util.Scanner;

public class PrintOneToN {
    public static void printNum(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        printNum(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int i=1;
        System.out.println("enter number n : ");
        int n =  sc.nextInt();
        printNum(i, n);
        sc.close();
    }
}
