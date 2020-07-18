package collection.Map;

import java.util.*;

//sort map by values using comparator
public class SortMapMethod2 {
    public static void main(String args[]){
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();
        hmap.put(10,"X");
        hmap.put(5,"M");
        hmap.put(2,"A");
        hmap.put(7,"L");

        System.out.println("Before Sorting:");
        System.out.println("hashmap "+hmap);
        Iterator itr = hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mape= (Map.Entry)itr.next();
            System.out.print("Key is "+mape.getKey());
            System.out.println(" value is "+mape.getValue());
        }

        Map<Integer,String> map1= sortByValues(hmap);

        System.out.println("After Sorting:");
        System.out.println("hashmap "+hmap);
        Iterator itr1 = hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mape= (Map.Entry)itr1.next();
            System.out.print("Key is "+mape.getKey());
            System.out.println(" value is "+mape.getValue());
        }


    }

    private static HashMap sortByValues(Map hmap){
        List list = new LinkedList(hmap.entrySet());
        //defined custom comparator here
        /*Collections.sort(list, new Comparator() {
            public int compare

        });*/
        return null;
    }
}
