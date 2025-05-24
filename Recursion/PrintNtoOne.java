public class PrintNtoOne {
    public static void printNtoOne(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
        printNtoOne(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNtoOne(n);
    }
}
