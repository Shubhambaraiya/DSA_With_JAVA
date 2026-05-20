public class Pevenlenghte {
    public static void printword(String name){
        for(String W:name.split(" ")){
            if(W.length()%2==0)
                System.out.println(W);
            }
        
    }
    public static void main(String []args){
        String name = "I AM A BAD BOYS";
        printword(name);

    }
}
