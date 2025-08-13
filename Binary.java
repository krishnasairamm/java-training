public class Binary {
    public static void main(String[] args) {
        int num = 15;
        int res=0;
        int c1=0;
        String rev = "";
         while(num>0){
            res = num%2;
            /* if(res==0){
                c0++;
            } */
            if(res==1){
                c1++;
            }
            rev = res + rev; 
            num/=2;
         }
         System.out.print(rev+" ");
         //System.out.print(c0+"  ");
         System.out.print(c1+" ");
         
    }
}
