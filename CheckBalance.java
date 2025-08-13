import java.util.*;

public class CheckBalance {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int balance = 1000;

        System.out.println("Select an option");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. WithDraw");

        int input = sc.nextInt();

        if(input == 1){
            System.out.println("Balance : " + balance);
        }
        if(input == 2){
            System.out.println("Initial Balance: "+balance);

            System.out.println("Enter amount to deposit : ");
            int deposit = sc.nextInt();

            int  totalBalance = balance + deposit;

            System.out.println("Total Balance : " + totalBalance);

        }
        if(input == 3){
            System.out.println("Initial Balance: "+balance);

            System.out.println("Enter amount to with draw : ");

            int WithDraw = sc.nextInt();
            
            if(WithDraw<balance){
                int  remBalance = balance - WithDraw;
                System.out.println("Total Balance : " + remBalance);
            }
            else{
                System.out.println("Insufficient amount with draw");
        }
            }
            
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
