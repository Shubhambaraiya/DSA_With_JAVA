import java.util.*;

public class insert {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insert elements in the hashmap

        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        System.out.println(map);
        // map.put("Indonesia", 130);
        // System.out.println(map);
        // searching of hashmap
        // if(map.containsKey("Indonesia")){
        // System.out.println("Key is present in the map");
        // }
        // else{
        // System.out.println("Key is not present in the map");
        // }
        // // // to get the value of key

        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));

        // int arr[] = {15,16,17};
        // for(int i = 0;i<3;i++){
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val : arr){
        // System.out.print(val+" ");
        // }
        // System.out.println();

        // iteration
        // for(Map.Entry<String,Integer>e:map.entrySet()){
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }
        // iteration using set
      System.out.println(  map.size());
        Set<String>keys = map.keySet();
        for(String key:keys){
        System.out.println(key+" "+map.get(key));
        }
        // Delete the pair in the hashmap
        // map.remove("China");
        // System.out.println(map);
    }
}
