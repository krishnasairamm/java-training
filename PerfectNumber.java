public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        int temp = n;
        int res = 0;
        
        /* for(int i = 1;i<=n/2;i++){
            if(n%i==0){
                res = res+i;
            }
        } */

        int i = 1;
        while(i<=n/2){
            if(n%i==0){
                res = res+i;
            }
            i++;
        }
        if(temp==res)
            System.out.println(temp + " Perfect Number");
        else
            System.out.println(temp+" Not Perfect Number");
    }
}
