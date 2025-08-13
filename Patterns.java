public class Patterns {
    public static void main(String[] args) {
        
        
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         System.out.println();

        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = 4;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        
        for(int i =1;i<=5;i++){
            for(int s = 1;s<=5-i;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        
        for(int i =5;i>=0;i--){
            for(int s = 1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
        System.out.println();

                for(int i =1;i<=5;i++){
            for(int s = 1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =4;i>=0;i--){
            for(int s = 1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Rhombus");

        for(int i =1;i<=5;i++){
            for(int s = 1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =4;i>=0;i--){
            for(int s = 1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        
        

    

       
    }

    
}
