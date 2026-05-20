public class Duplicateelement{
    public static void main(String []args){
        int size =7;
        int arr[] = new int[size];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 5;
        
        for(int i = 0;i<size;i++){
            int element = arr[i];
            if(element==arr[i+1]){
                System.out.println(arr[i+1]);
            }
            // System.out.println(arr[i]);
        }
    }
}