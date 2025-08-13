public class SortUsingBuffer {
    public static void main(String[] args) {
        
        String s = "listen";
        StringBuffer sbf = new StringBuffer(s);
        //char[] ch = s.toCharArray();
        //System.out.println(ch);
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<s.length()-1;j++){
                if(sbf.charAt(j)>sbf.charAt(j+1)){
                    char char1 = sbf.charAt(j);
                    char char2 = sbf.charAt(j + 1);
                    sbf.replace(j + 1, j + 2, String.valueOf(char1));
                    sbf.replace(j, j + 1, String.valueOf(char2));
                }
            }
        }
     System.out.println(sbf.toString());
     
    }
}