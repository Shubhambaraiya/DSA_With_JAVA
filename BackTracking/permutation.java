public class permutation {
    public static void printpermutation(String str,String per){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char crr = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            printpermutation(newString, per+crr);
        }
    }
    public static void main(String []args){
        String str = "abc";
        printpermutation(str, "");

    }
}
