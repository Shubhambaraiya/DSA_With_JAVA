public class duplicate {
    public static void main(String []args){
        int arr[] = {1,2,2,4,5,5};
        int temp[] = new int[arr.length];

        // time complexity will be 0(n)
        for(int i =0;i<=arr.length;i++){
            if( temp[arr[i]] ==1){
System.out.println(arr[i]);
break;
            }
            temp[arr[i]]=1;
        }
    }
}
  