package collection.Map;

import java.util.HashMap;

public class GetSizeOfMap {
    public static void main(String args[]){
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();
        hmap.put(1,"zzz");
        hmap.put(2,"fff");
        hmap.put(3,"dsfkh");
        hmap.put(4,"sjegfjdshg");
        hmap.put(5,"sdkjfhks");

        System.out.println("Size of Hashmap : "+ hmap.size());
    }
}
