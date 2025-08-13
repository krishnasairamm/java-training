public class StringSort {
    public static void main(String[] args) {
        String s = "kdsjhfal";
        char[] ch = s.toCharArray();
        System.out.println(ch);
        for(int i=0;i<ch.length-1;i++){
            for(int j=0;j<ch.length-1;j++){
                if (ch[j] > ch[j+1]) {
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
         System.out.println(ch);
    }
}
