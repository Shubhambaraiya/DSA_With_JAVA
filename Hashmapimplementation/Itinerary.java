import java.util.*;
public class Itinerary {
    public static String begining(HashMap<String,String>tick){
        HashMap<String,String>revMap = new HashMap<>();
        for(String key:tick.keySet()){
            revMap.put(tick.get(key),key);
        }

    for(String key:tick.keySet()){
        if(!revMap.containsKey(key)){
            return key;
        }
    }
    return null;

    }
    public static void main(String []args){
HashMap<String , String> map = new HashMap<>();
map.put("Chennai","Bangluru");

map.put("Mumbai","Delhi");
map.put("Goa","Chennai");
map.put("Delhi","Goa");
System.out.println(map);
String start = begining(map);
while(map.containsKey(start)){
    System.out.print(start+"->");
    start = map.get(start);
}
System.out.println(start);

    }
}
