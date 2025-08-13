public class Prefix {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;
        int c[] = new int[n];
        int sum =0;
        int left = 1;
        int right = 3;

        for(int i =0;i<n;i++){
            c[i] = sum+a[i];
            sum = c[i];
            
        }

        for(int i =0;i<n;i++){
            System.out.print(c[i]+" ");
        }

        //finding of sum range
        int range = (left==0) ? c[right] : c[right] - c[left-1];
        System.out.println("\n"+range);
    }
    
}
