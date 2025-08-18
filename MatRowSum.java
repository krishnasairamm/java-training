public class MatRowSum {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int max = 0;
        
        for(int i = 0;i<a.length;i++){
            int sum = 0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);

    }
}
