public class InsertionString {
    public static void main(String[] args) {
        String s = "cat apple dog ant bee ";
        String parts[] = s.split(" ");
        for(int i=1;i<parts.length;i++){
            String temp = parts[i];
            int j = i-1;
           // String k = parts[j];
            while(j>=0 && parts[j].compareTo(temp)>0){
                parts[j+1] = parts[j];
                j--;
            }
            parts[j+1]=temp;

            System.out.println();
            System.out.println("Pass - " + (i));
            
            for(String k : parts){
                System.out.print(k+" ");
            }
        }
    }
}
