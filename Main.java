public class Main
{
	public static void main(String[] args) {
	   // Scanner sc = new Scanner(System.in);
	    
	    int hage = 20;
	    int wage = 8;
	    int hsalary = 7000;
	    int wsalary = 4000;
	    
	   if(hage>=30 && wage>=28 && hsalary>=70000 && wsalary>=40000){
	        System.out.println("Eligible for loan");
	    }
	   else{
	       System.out.println("Loan not approved");
	       if(hage<30){
	           System.out.println("Husband age is insufficient");
	       }
	       if(wage<28){
	           System.out.println("wife age is insufficient");
	       }
	       if(hsalary<70000){
	        System.out.println("Husband salary is insufficient");
	       }
	       if(wsalary<40000){
	        System.out.println("Wife salary is insufficient");
	       }
	       
	   }
	    
	}    
	
}

