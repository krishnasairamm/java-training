import java.util.Scanner;

public class RepeatingInArray {
    public static void main(String[] args) {
        
/*         int[] arr = {10,99,82,82,90,10,99};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   System.out.println(arr[i] +" ");
                   return;
                    
                }   
            }   
        }
 */
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a size of an array : ");
		int a=sc.nextInt();
		System.out.print("Enter the "+a+" Elements : ");
		int b[]= new int[a];
		for(int i=0;i<a;i++){
		    b[i]=sc.nextInt();
		}
        sc.close();
		int count=0;
		for(int i=0; i<a; i++) {
			for(int j=i+1; j<a; j++) {
			    if(b[i]==b[j]){
			    count++;
			    break;
			    }
			}
			if(count>0){
			System.out.println("The first repeating element is "+b[i]);
			    break;
			}
		}
	}
}