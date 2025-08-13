public class HalfStringRev {
    public static void main(String[] args) {
        String s = "abcxyz";
        char[] ch = s.toCharArray();
        /* int half = ch.length/2;
        for(int i=0;i<half/2;i++){
            char temp = ch[i];
            ch[i] = ch[half-1-i];
            ch[half-1-i] = temp;
        }
            
        System.out.println(ch); */
        int start = ch.length / 2;
        int end = ch.length - 1;
        for(int i=ch.length/2;i<ch.length-1;i++){
            
           char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp; 
            start++;
            end--;
           // System.out.println(ch[i]);
        }
        System.out.println(ch);
    }
}