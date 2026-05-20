public class dm3 {
    public static void main(String []args){
        int n = 5;
        int arr[] = new int[n];
        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 1;
        arr[4] = 7;
        int s =n*(n+1)/2;
        int suma = 0;
        for(int i = 0;i<n;i++){
            suma+=arr[i];
        }
        System.out.println(suma-s);
    }
}
