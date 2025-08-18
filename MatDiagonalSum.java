public class MatDiagonalSum {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int lsum = 0;
        int rsum = 0;
        //left diagonal sum
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    
                    lsum+=a[i][j];
                }
                
            }
        }

        //right diagonal sum
        for(int i =a.length-1;i>=0;i--){
            for(int j=a[i].length;j>=0;j--){
                if(i==j){
                    rsum+=a[i][j];
                }
                
            }
        }
        System.out.println("left diagonal sum "+lsum);
        System.out.println("right diagonal sum "+rsum);
    }
}
