//import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {20,70,90,30,10};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    /* int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; */
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
            System.out.println();
            System.out.println("Pass - "+ (i+1));
            
            for(int k : arr){
                System.out.print(k+" ");
            }
        }
    }
}
