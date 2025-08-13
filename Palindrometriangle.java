public class Palindrometriangle {

    public static void main(String[] args) {
      
      int n = 5;
      for(int i =1;i<=n;i++ ){
        for(int s = 1;s<=n-i;s++){
          System.out.print(" ");
        }
        for(int k=i;k>=1;k--){
            System.out.print(k);
        }
        for(int j = 2;j<=i;j++){
            
                System.out.print(j);
        }
        System.out.println();
      }

      System.out.println();
      for(int i = 1;i<=n;i++){
        
        for(int j = 1;j<=i;j++){
          System.out.print(i +" "+j);
        }
        System.out.println();
      }
    }
    
}

