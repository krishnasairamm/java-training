public class PrimeNumber {
    public static void main(String[] args) {
        int num = 11;
        int count =0;
        for(int i = 2;i<num;i++){
            if(num%i==0){
                count=1;
                break;
            }    
        }
        if(count==0){
            System.err.println("Prime Number");
        }
        else{
            System.out.println("Composite Number");
        }
    }
}
