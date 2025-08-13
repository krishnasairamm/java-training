import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String s="";
      String[] st = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
      int[] arr = {1,4,5,9,10,40,50,90,100,400,500,900,100};
      /* while(a>0){
        if (a >= 1000) {
            System.out.print(roman(1000));
            a -= 1000;
        } else if (a >= 900) {
            System.out.print(roman(900));
            a -= 900;
        } else if (a >= 500) {
            System.out.print(roman(500));
            a -= 500;
        } else if (a >= 400) {
            System.out.print(roman(400));
            a -= 400;
        } else if (a >= 100) {
            System.out.print(roman(100));
            a -= 100;
        } else if (a >= 90) {
            System.out.print(roman(90));
            a -= 90;
        } else if (a >= 50) {
            System.out.print(roman(50));
            a -= 50;
        } else if (a >= 40) {
            System.out.print(roman(40));
            a -= 40;
        } else if (a >= 10) {
            System.out.print(roman(10));
            a -= 10;
        } else if (a >= 9) {
            System.out.print(roman(9));
            a -= 9;
        } else if (a >= 5) {
            System.out.print(roman(5));
            a -= 5;
        } else if (a >= 4) {
            System.out.print(roman(4));
            a -= 4;
        } else {
            System.out.print(roman(1));
            a -= 1;
        }
      } */
      int i = arr.length-1;
       while (a > 0) {
        int div = a / arr[i];
        while (div > 0) {
            s += st[i];
            div--;
        }
        a = a % arr[i];
        i--;
    }
    System.out.println(s);
      
      sc.close();  
    }

    /* public static String roman(int i){
        switch (i) {
            case 1:
                return "I";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 900:
                return "CM";
            case 1000:
                return "M";
            default: 
                return "0";
        } 
    }*/

}

