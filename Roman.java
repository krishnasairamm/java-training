import java.util.*;
public class Roman
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int count=0,t=0;
		//char[] st = {'i', 'v', 'x', 'l', 'c', 'd', 'm'};
		for(int i=a.length()-1; i>=0; i--) {
		    char ch=a.charAt(i);
			if(aa(ch)>=count)
				t=t+aa(ch);
			else
			   t=t-aa(ch);
			count=aa(ch);
		}		
		System.out.println(t);
		sc.close();

	}
	public static int aa(char ch) {
		switch(ch) {
		case 'm': 
		case 'M':
			return 1000;
		case 'd':
		case 'D':
			return 500;
		case 'c':
		case 'C':
			return 100;
		case 'l':
		case 'L':return 50;
		case 'x':
		case 'X':
			return 10;
		case 'v':
		case 'V':
			return 5;
		case 'i':
		case 'I':
			return 1;
		default:
		  return 0;

		}
	}
}