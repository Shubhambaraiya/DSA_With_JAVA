import java.util.HashSet;

public class uniquesubseq {
    public static void unisubseq(String str,int idx,String neString,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(neString)){
                return;
            }
            else{
                System.out.println(neString);
                set.add(neString);
                return;
            }
        }
        char crr = str.charAt(idx);
        unisubseq(str, idx+1, neString+crr, set);
        unisubseq(str, idx+1, neString, set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String>hs = new HashSet<>();
        unisubseq(str,0,"",hs);
    }
}
