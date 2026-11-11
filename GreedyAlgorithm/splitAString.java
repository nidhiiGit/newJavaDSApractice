//SPLIT A STRING IN BALANCED STRINGS;
class splitAString{
    public static int BalanceStrings(String s){
        int curr=0;
        int bal=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                sb.append('L');
                bal++;
            }else{
                sb.append('R');
                bal--;
            }
            if(bal==0){
                curr++;
                System.out.println(sb);
                sb.setLength(0);
            }
        }
        return curr;
    }
    public static void main(String[] args) {
        String s = "LRRRRLLRLLRL";

        System.out.println(BalanceStrings(s));
    }
}
