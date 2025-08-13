public class Nonduplicates {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,1};
        int[] b= new int[a.length];
        for(int i=0;i<a.length;i++){
            //boolean isFoundBefore = false;
            for(int k=0;k<a.length;k++){
                if(a[i]!=a[k]){
                    //isFoundBefore = true;
                    b[i]=a[i];
                    
                }
            }
            /* if (!isFoundBefore) {
                b[i]=a[i];
            } */
            
        }
        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }

    }
}
