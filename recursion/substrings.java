public class substrings {
    public static int consecutiveSubstrings(String str, int idx){
        if(idx==str.length()){
            return 0;
        }
        int count=0;
        for(int i=0; i<=idx; i++){
            if(str.charAt(i) == str.charAt(idx)){
                count++;
            }
        }
        return count+consecutiveSubstrings(str,idx+1);
    }
    public static void main(String[] args) {
        System.out.println(consecutiveSubstrings("abcab",0));
    }
}
