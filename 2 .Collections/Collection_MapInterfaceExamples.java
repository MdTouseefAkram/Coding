import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collection_MapInterfaceExamples {
    public static void main(String[] args) {

//        HashMap<Integer,String> mp = new HashMap<>(); //unsorted and random order.
//        Map<Integer,String> mp = new HashMap<>(); // write Map or Hashmap in front , it work, i.e we can write the class name or interface name, both works.
//        Map<Integer,String> mp = new LinkedHashMap<>(); // order of input sequence preserve.
        TreeMap<Integer, String> mp = new TreeMap<>(); //sorted order
        mp.put(3, "Aman");
        mp.put(1,"Rohan");
        mp.put(2,"Riya");
        System.out.println(mp);

        //Iterating over values in a map
        for(var i : mp.keySet()) {
            System.out.println(i);
        }

        //Iterating over the key value mapping
        for(var e : mp.entrySet()) {
            System.out.println(e.getValue());
        }

        mp.putIfAbsent(1,"Priya"); // over-rides
        System.out.println(mp.entrySet());
        System.out.println(mp.get(2)); // Riya
        System.out.println(mp.containsKey(4)); //false
        System.out.println(mp.containsValue("Riya")); //true
        System.out.println(mp.keySet());
        System.out.println(mp.values());
    }
}
