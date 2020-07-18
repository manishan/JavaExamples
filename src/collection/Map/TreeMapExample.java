package collection.Map;

import java.util.*;

public class TreeMapExample {
    public static void main(String args[]){
        TreeMap<Integer,String> tmap = new TreeMap<Integer, String>();

        tmap.put(23,"manisha1");
        tmap.put(12,"aaaa");
        tmap.put(2,"ddd");
//to descend the order of entries
        TreeMap<String,Integer> tmap1 = new TreeMap<String, Integer>(Collections.reverseOrder());
        tmap1.put("A",444);
        tmap1.put("B",424);
        tmap1.put("C",544);
        tmap1.put("D",144);

        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print(mentry.getKey());
            System.out.println(mentry.getValue());
        }
        System.out.println("");

        Set set1 = tmap1.entrySet();
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator1.next();
            System.out.print(mentry.getKey());
            System.out.println(mentry.getValue());
        }



    }
}
