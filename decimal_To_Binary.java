public class decimal_To_Binary {
//     public static void decimaltobinary(int n){
//         int binary[] = new int[1000];
//         int i = 0;
//         while (n > 0) {
//             binary[i] = n % 2;
//             n = n / 2;
//             i++;
//         }
//         for (int j = i - 1; j >= 0; j--) {
//             System.out.print(binary[j]);
//         }}
// Using BitManupulation
public static void decimaltobinary(int n){
    for (int i = 5;i>=0;i--){
        int k = n>>i;
        if((k & 1)>0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}
    public static void main(String []args){
int  n = 1;
System.out.println("Decimalt -"+n);
System.out.println("Binary -");
decimaltobinary(n);
 }}

