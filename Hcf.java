public class Hcf {
    public static void main(String[] args) {
        
        int a = 8;
        int b = 16;
        int hcf = 0;

        for(int i = 1;i<=a;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        int lcm = (a*b)/hcf;
        System.out.println(a<b ? a : b);
        System.out.println("HCF = "+hcf);
        System.out.println("LCM = "+lcm);

        
    }
}
