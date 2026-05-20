import java.util.ArrayList;

public class printsubset {
//     public static void printsu(ArrayList<Integer>subset){
//         for(int i = 0;i<subset.size();i++){
//             System.out.print(subset.get(i)+" ");
//         }
//         System.out.println();
//     }
    public static void printsub(int n,ArrayList<Integer>subset){
        if(n==0){
            System.out.println(subset+" ");
            return;

        }
        subset.add(n);
        printsub(n-1, subset);
        subset.remove(subset.size()-1);
        printsub(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer>susbset = new ArrayList<>();
        printsub(n, susbset);

    }
}
