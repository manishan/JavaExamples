package collection.Map;

import java.util.*;

//08/09/2020
public class DetailsOfMapAndLinkedHashMap {
    public static void main(String args[]){
        HashMap<Integer,String> hmap=new HashMap<Integer, String>();

        hmap.put(1,"Manisha");
        hmap.put(2,"aaaa");
        hmap.put(3,"Test");

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry map= (Map.Entry)iterator.next();
            System.out.print("map key is "+map.getKey());
            System.out.println(" map value is "+map.getValue());
        }

        for(Map.Entry me:hmap.entrySet()){
            System.out.print("map key is "+me.getKey());
            System.out.println(" map value is "+me.getValue());
        }
            
        LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<Integer,String>();
        lhmap.put(1,"aa");
        lhmap.put(4,"bb");
        lhmap.put(2,"dd");
        System.out.println(lhmap);
    }
}
