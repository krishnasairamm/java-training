//import java.util.*;
public class Patterns2 {
    public static void main(String[] args) {
        
        /* Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if((i>1 && i<n && j>1 && j<n) && i==j || j==k){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
 */
        /* for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                if(i>1 && j>1){
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
                
            }
            System.out.println();
        }
         */
        /* 
         for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                int k = 5-i+1;
                if(i==j || j==k || i==1 || j==1 || i==5 || j==5){
                    System.out.print(" * ");
                    
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
 */
        System.out.println();
        System.out.println("left Side Triangle: ");
        System.out.println();

        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1|| j==1 || j==5 || i==j){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }

        for(int i =4;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || j==5 || i==j){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Right Side Triangle: ");
        System.out.println();

        for(int i =1;i<=5;i++){
            for(int s = 1;s<=5-i;s++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==5 || i==j){
                    System.out.print("   "+i);
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            System.out.println();
        }
        for(int i =4;i>=0;i--){
            for(int s = 1;s<=5-i;s++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || i==5 || j==5 || i==j){
                    System.out.print("   "+i);
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            System.out.println();
        }

        for(int i =1;i<=5;i++){
            for(int s = 1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               // int k = 5-i+1;
                if(i==j || j==1)
                    System.out.print((char)(64+i)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i =4;i>0;i--){
            for(int s = 1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                //int k = 5-i+1;
                if(i==j || j==1)
                    System.out.print((char)(48+i)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}
