public class IntegerChar {
    public static void main(String[] args) {
        String s = "abcdxyz";
        char[] ch = s.toCharArray();

        for(int i=1;i<ch.length;i++){
            char temp = ch[i];
            int j = i-1;
            while(j>=0 && ch[j]<temp){
                ch[j+1] = ch[j];
                j--;
            }
            ch[j+1]=temp;

            System.out.println();
            System.out.println("Pass - " + (i));
            
            for(char k : ch){
                System.out.print(k+" ");
            }
        }
    }
}
