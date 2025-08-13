public class StrongNumber {
    public static void main(String[] args) {
        int n =154;
        int temp = n;
        int num = 0;
        int fact = 0;

        /* int res = 1;
        for(int i =2;i<=n;i++){
            res = res*i;
        }
        System.out.println(res); */

        while(n>0){
            num = n%10;
            int res = 1;
            for(int i =1;i<=num;i++){
                res = res*i;
                
            }
            fact = fact + res; 
            n/=10;
        }
        if(fact == temp)
            System.out.println(fact + " It is strong number");
        else
            System.out.println(temp + " Not Strong Number");
        
    }
}
