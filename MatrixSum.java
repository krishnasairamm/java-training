public class MatrixSum {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};
       

        int[][] c = new int[a.length][a[0].length];
        int n = a.length;
        for(int i = 0;i<n;i++){
            for(int j=0;j<b[i].length;j++){
                    c[i][j]=a[i][j]+b[i][j]; 
            }
            System.out.println();
        } 

        for(int i[] : c){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
