package collection.Map;

import java.util.*;

public class SynchronizedMapExample {

    public static void main(String args[]){
        Map<String,String> hmap = new HashMap<String,String>();

        // populate the map
        hmap.put("Value1", "20");
        hmap.put("Value2", "30");
        hmap.put("Value3", "40");

        // printing the Collection
        System.out.println("Map : " + hmap);

        // create a synchronized map
        Map<String, String>
                synmap = Collections.synchronizedMap(hmap);

        // printing the Collection
        System.out.println("Synchronized map is : "
                + synmap);

    }
}
