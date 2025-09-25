public class Recurrsion {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int i =0;
        int n = arr.length;
        num(arr,i,n);
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
    public static void num(int arr[], int i,int n){
        if(i==n/2){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
        num(arr,i+1,n);
    }
}
