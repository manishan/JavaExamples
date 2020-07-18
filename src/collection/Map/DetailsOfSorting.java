package collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
//Sort map by key using TreeMap
public class DetailsOfSorting {
    public static void main(String args[]){
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();
        hmap.put(10,"manisha");
        hmap.put(5,"manisha2");
        hmap.put(2,"manisha3");
        hmap.put(7,"manisha4");

        System.out.println("Before Sorting:");
        System.out.println("hashmap "+hmap);
        Iterator itr = hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mape= (Map.Entry)itr.next();
            System.out.print("Key is "+mape.getKey());
            System.out.println("value is "+mape.getValue());
        }

        Map<Integer,String> tmap = new TreeMap<Integer,String>(hmap);
        System.out.println("After Sorting:");
        System.out.println("hashmap "+hmap);
        Iterator itr1 = hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mape= (Map.Entry)itr1.next();
            System.out.print("Key is "+mape.getKey());
            System.out.println("value is "+mape.getValue());
        }
    }
}
