import java.util.Arrays;

public class ArrayLi{
    public  static  class ArrayList{
        int arr[] = new int[1];
        int idx = 0;
        int size = 0;

        public void add(int ele){
            if(size==arr.length){
                int []brr = Arrays.copyOf(arr, arr.length*2);
                arr = new int[brr.length];
                arr =  Arrays.copyOf(brr, brr.length);
            }
arr[idx] = ele;
idx++;
size++;
        }

    }
    public static void main(String []args){
        ArrayList arr = new ArrayList();
        arr.add(2);
arr.add(1);
// System.out.println(arr);
System.out.println(arr.size);
    }
}
