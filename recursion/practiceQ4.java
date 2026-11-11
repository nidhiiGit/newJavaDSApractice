public class practiceQ4 {
    public static int contigiousSubstrings(String str, int idx){
        if(str.length() == idx){
            return 0;
        }

        int count=0;
        for(int i=0; i<=idx; i++){
            if(str.charAt(i) == str.charAt(idx)){
                count++;
            }
        }
        return count+contigiousSubstrings(str, idx+1);
    }
    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(contigiousSubstrings(str,0));
    }
}
