public class QuickSort1 {
    public static void main(String[] args) {
        int arr[] = {40,30,10,20,60,50};
        int i=0;
        int j=arr.length-1;
        partition(arr,i,j);
        for(int g=0;g<arr.length;g++){
            System.out.print(arr[g]+" ");
        }
    }
    public static void partition(int arr[],int i,int j){
        if(i<j){
            int pi = qsort(arr, i, j);
            partition(arr,i, pi-1);
            partition(arr, pi+1, j);
        }
    }
    public static int qsort(int arr[],int i,int j){
        int pivot = arr[i];
        int low = i+1;
        int high = j;

        while(low<high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        int temp1 = arr[high];
        arr[high] = arr[i];
        arr[i] = temp1;
        return high;
    }
}
