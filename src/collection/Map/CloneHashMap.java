package collection.Map;

import java.util.HashMap;

public class CloneHashMap {
    public static void main(String args[]){
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();

        //adding new elements
        hmap.put(11,"Jack");
        hmap.put(22,"Rock");
        hmap.put(33,"Rick");
        hmap.put(44,"Smith");
        hmap.put(55,"Will");

        System.out.println("Hashmap contains: "+hmap);

        //creating a new hashmap
        HashMap<Integer,String> hmap2= new HashMap<Integer, String>();
        hmap2= (HashMap)hmap.clone();

        System.out.println(hmap2);

    }
}
