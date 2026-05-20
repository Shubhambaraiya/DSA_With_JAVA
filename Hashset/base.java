import java.util.HashSet;
import java.util.Iterator;
public class base {
    public static void main(String []args){
HashSet<Integer>set = new HashSet<>();
set.add(1);
set.add(3);
set.add(5);
set.add(7);
set.add(3);
set.add(4);
set.add(4);
System.out.println(set.size());
System.out.println(set);
//Deleting any element from hashset
set.remove(2);
System.out.println(set);
// Searching in hashset
if(set.contains(1)){
    System.out.println("hase contain 1");
}
if(!set.contains(6)){
    System.out.println("hash does not contain 6");
}
Iterator it = set.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}
    }
}
