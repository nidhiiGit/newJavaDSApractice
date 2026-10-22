//SPLIT A STRING IN BALANCED STRINGS;
class splitAString{
    public static int BalanceStrings(String s){
        int curr=0;
        int bal=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                bal++;
            }else{
                bal--;
            }
            if(bal==0){
                curr++;
            }
        }
        return curr;
    }
    public static void main(String[] args) {
        String s = "LRRRRLLRLLRL";

        System.out.println(BalanceStrings(s));
    }
}
