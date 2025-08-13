public class Fibonacci {
    public static void main(String[] args) {
        
        int num = 5;
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i =2;i<=num;i++){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
        }
       System.out.println();
       System.out.println(a);
    }
}