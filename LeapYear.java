
public class LeapYear {

	public static void main(String[] args) {
		
		int year = 2025;
        
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("yes , it is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

	}

}
