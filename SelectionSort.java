public class SelectionSort{
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String []args){
        int arr[] = {8,4,3,9,2,1};
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int current = arr[i];
            while(j>=0 && current<arr[j]){
             arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        PrintArr(arr);
    }
}