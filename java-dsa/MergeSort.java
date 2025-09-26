public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,50,40,30,20};
        int i = 0;
        int j= arr.length-1;
        merge(arr,i,j);
        for(int z=0;z<arr.length;z++){
            System.out.print(arr[z]+" ");
        }
        
    }
    public static void merge(int arr[],int i,int j){
        if(i<j){
          int mid = (i+j)/2;
          merge(arr,i,mid);
          merge(arr, mid+1, j);
          conquer(arr,i,j,mid);
        }
        
    }
    public static void conquer(int arr[],int i,int j,int mid){
        int k = mid+1;
        int m = i;
        int s = 0;
        int[] arr2 = new int[j-i+1];
        while(i<=mid && k<=j){
            if(arr[i]<arr[k]){
                arr2[s++] = arr[i++];
            }
            else{
                arr2[s++]= arr[k++];
            }
        }
        while(i<=mid){
            arr2[s++] = arr[i++];
        }
        while(k<=j){
            arr2[s++] = arr[k++];
        }

        for(int n=0;n<arr2.length;n++){
            arr[m+n] = arr2[n];
        }
    }
}
