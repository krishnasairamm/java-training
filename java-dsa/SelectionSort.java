public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {30,70,50,20,10};

        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            System.out.println();
            System.out.println("Pass - " + (i+1));
            
            for(int k : arr){
                System.out.print(k+" ");
            }
        }
    }
}
