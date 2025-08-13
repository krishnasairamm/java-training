public class HappyNumber {
    public static void main(String[] args) {
        int input = 10;
        int rem = 0;
        int res = 0;

        while(input > 0){            
            rem = input%10;
            res += Math.pow(rem, 2);
            input/=10;
            System.out.println(res);
            if(input == 0 && res>9){
                input = res;
                res = 0;
                
            }            
        }
        if(res==1){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not Happy");
        }
    }
}