//import java.util.Scanner;

public class test {
    public static void main(String[] args) {
      
      /* int n = 5;
      for(int i = 1;i<=n;i++){
        
        for(int j = 1;j<=i;j++){
          System.out.print(i +" "+j);
        }
        System.out.println();
      } */
     
        /* for(int i =5;i<5;i++){
          System.out.println(i);
        } */

        /* System.out.println(5^7);
        System.out.println(5&7);
        System.out.println(10&(1<<2)); */ // if output is 0, it is unset, else set

      String org = "1234567890";
      String rev = ""; 
      for(int i = org.length()-1;i>=0;i--){
        rev+=org.charAt(i);
      }
      System.out.println(rev);
    }    
}
