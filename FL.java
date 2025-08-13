public class FL {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 6;
        int n = arr.length;
        
        int c[] = new int[2];

        for(int i=0;i<n;i++){
            if(target==arr[i]){
                c[i] = i;
                
            }
        }
        
        if(c.length==0){
            for(int i =0;i<n;i++){
            System.out.print(c[i]+" ");
        }
        }
        else{
        for(int i =0;i<n;i++){
            System.out.print(c[i]+" ");
        }
    }
    }
}
