public class SameletterCount {
    public static void main(String[] args) {
        String s = "abcabcabc";
        //6 types of code
        //i!=j
        
        for(int i = 0;i<s.length();i++){
            
            int test = 0;
             for(int k=0;k<i;k++){
                if(s.charAt(k)==s.charAt(i)){
                    test = 1;
                    break;
                }
            }
            if (test==1) {
                continue; 
            } 
           /* if(s.indexOf(ch)<i){
            continue;
           } */
            int count = 0;
            for(int j = 0;j<s.length();j++){

                if((s.charAt(i)==s.charAt(j))){
                    count++;
                }
            }
            if(count>1){
                System.out.println(s.charAt(i)+" "+(count));
                break;
            }
            
        }
    }
}
