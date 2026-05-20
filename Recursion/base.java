public class base {
    public static void printatopowerb(int a){
        if(a==0){
            return ;
        }
        System.out.println(a);
        printatopowerb(a-1);
    }
    public static void main(String []args){
        int a = 5;
       printatopowerb(a);
    }
}
