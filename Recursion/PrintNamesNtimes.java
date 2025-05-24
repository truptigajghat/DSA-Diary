import java.util.Scanner;

public class PrintNamesNtimes {
    public static void printname(int i, int n) {
        if(i>n){
            return ;
        }
        System.out.println("Trupti");
        printname(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("enter the number of time you want to print name - Trupti");
        int n = sc.nextInt();
        printname(i, n);
        sc.close();
    }
}
