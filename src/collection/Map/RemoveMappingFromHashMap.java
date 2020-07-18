package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class RemoveMappingFromHashMap {
    public static void main(String args[]){
        HashMap<String,String> hmap = new HashMap<String,String>();
        hmap.put("A","manisha");
        hmap.put("B","Manisha1");
        hmap.put("C","Manisha2");
        hmap.put("D","Manisha3");
        System.out.println("Before remove action");
        for(Map.Entry me:hmap.entrySet()){
            System.out.print("Map key is "+me.getKey());
            System.out.println(" Map value is "+me.getValue());
        }

        Object removedElement1 = hmap.remove("C");
        System.out.println("Element removed is: " +removedElement1);

        Object removedElement2 = hmap.remove("A","C");
        System.out.println("Element removed is: " +removedElement2);

        System.out.println("After remove action");
        for(Map.Entry me:hmap.entrySet()){
            System.out.print("Map key is "+me.getKey());
            System.out.println(" Map value is "+me.getValue());
        }
        System.out.println(hmap.containsKey("B"));
        System.out.println(hmap.containsValue("Manisha"));


       // hmap.clear();
        //System.out.println("is hashmap empty "+hmap.isEmpty());
        //System.out.println(hmap);
    }
}
