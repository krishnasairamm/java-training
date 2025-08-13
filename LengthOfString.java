public class LengthOfString {
   public static void main(String[] args) {
    String s = "this is a book";
    String[] s2 = s.split(" ");
     String maxlen = s2[0];
     //System.out.println(maxlen);
        String minlen = s2[0];
        int maxcount = s2[0].length();
        int mincount = s2[0].length();

    for(int i = 0;i<s2.length;i++){
        if(s2[i].length()>maxcount){
            maxcount = s2[i].length();
            maxlen= s2[i];
        }   
        if(s2[i].length()<mincount){
            mincount=s2[i].length();
            minlen = s2[i];
        }
    }
    System.out.println(maxlen+" "+maxcount);
    System.out.println(minlen+" "+mincount);
   } 
}
