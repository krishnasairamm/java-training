import java.util.*;
public class InttoR {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a=sc.nextInt();
		sc.close();
		int[] b = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] c= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		//System.out.print("The Roman number of the "+a+" is : ");
		while(a>0) {
		    for(int i=0;i<b.length;i++){
		        if(a>=b[i]){
		            a=a-b[i];
		            System.out.print(c[i]);
		            break;
		        }
		    }
		}
	}
}