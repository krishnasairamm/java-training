public class Setbits {
    public static void main(String[] args) {
        int n =5;
        int c1 =0,c2=0;
       int a = 5;
        for(int i=0;i<n;i++){
           if((n&(1<<i))!=0){
            c1++;
           }

        }
        System.out.println(c1);
        //System.out.println(5&(5-1));
        while(a>0){
            a=a&(a-1);
            c2++;
        }
        System.out.println(c2);
    }
}
