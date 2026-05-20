public class keywordcom{
    public static String []keybord = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keywordcombination(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char crr = str.charAt(idx);
        String mapping  = keybord[crr-'0'];
        for(int i = 0;i<mapping.length();i++){
            keywordcombination(str,idx+1,newString+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "4";
        keywordcombination(str,0,"");
    }
}