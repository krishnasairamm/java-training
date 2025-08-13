public class EvenOdd {
    
    public static void main(String[] args) {

        int count1 = 0 , count2 = 0;
        
        for(int i = 1; i<=10; i++){
             if(i%2==0){
                System.out.println(i + " Even");
                
                count1++;

             }
             else{
                System.out.println(i + " Odd");
                count2++;
             }
            
        }
        System.out.println("total even: " + count1);
        System.out.println("total odd: " + count2);
    }
}
