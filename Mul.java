public class Mul {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] c = new int[a.length];

        for(int i=0;i<a.length;i++){
            int p =1;
            for(int j = 0;j<a.length;j++){
                if(i!=j)
                 p *= a[j];
                 c[i] = p;
            }
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}