public class subsequences {
    public static void subseq(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char crr = str.charAt(idx);
        subseq(str, idx+1, newString+crr);
        subseq(str, idx+1, newString);

    }
    public static void main(String []args){
        String str = "abc";
        subseq(str,0,"");
    }
}
