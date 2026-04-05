public class InsertionSort {
    public static void main(String []args){
        int arr[] = {8,2,1,9,3,7};
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
