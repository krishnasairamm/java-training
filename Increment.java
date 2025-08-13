public class Increment {
    public static void main(String[] args) {
         int input = 123456789;
         int n  = input;
         int rem = 0;
         int val1 = 0;
         int count1 = 0;
         int count2 = 0;

         while (input>0) {
            input/=10;
            count1++;
         }
        

         while(n>9){

            rem = n%10;
            val1 = (n%100) / 10;

            n/=10;
            if(val1<rem){
                count2++;
            }
            
         }
         if(count2==count1-1){
            System.out.println("yes it is");
         }
         else{
            System.out.println("no");
         }
    }
}
