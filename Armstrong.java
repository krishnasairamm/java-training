import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        sc.close();

        int temp = val1;
        int val2 = val1;
        int rem , res = 0;
        int count = 0;

        while (val1>0) {
            val1/=10;
            count++;
        }

        while (val2>0) {
            
            rem = val2%10;
            
            res += Math.pow(rem,count);
            val2/=10;
        }

        if(temp == res){
            System.out.println(temp + " It is armstrong number");
        }
        else{
            System.out.println(temp+ " It is not armstrong number");
        } 

        
       
        
    }
}
