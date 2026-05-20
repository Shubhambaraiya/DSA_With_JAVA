public class sum {
    public static void printSum(int n,int sum){
        if(n==1){
         sum = sum+n;
         System.out.println(sum);
         return ;
        }
        sum = sum+n;
        printSum(n-1,sum);
        return;
    }
    public static void main(String []args){
        int n = 100;
        printSum(n,0);
    }
}
