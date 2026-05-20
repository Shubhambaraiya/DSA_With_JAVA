public static boolean startWith(String prefix){
    Node crr = root;
    for(int i = 0;i<prefix.length();i++){
        int idx = prefix.charAt(i)-'a';
        if(crr.Children[idx]==null){
            return false;
        }
        crr = crr.Children[idx];
    }
    return true;
}