public class RangePrime {
    public static void main(String[] args) {
       // int v1 = 1;
        int v2 = 100;

        for(int i = 1;i<=v2;i++){
            int count = 0;   

            for(int j = 2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
        }     
        if(count==0)
            System.out.print(i+" ");      
        }
    }
}