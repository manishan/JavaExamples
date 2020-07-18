package collection.Map;

import java.io.*;
import java.util.HashMap;

public class SerializedMap {
    public static void main(String args[]){
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();
        System.out.println(hmap.put(1,"manisha1"));
        hmap.put(2,"manisha2");
        hmap.put(3,"manisha3");
        hmap.put(4,"manisha4");
        System.out.println(hmap.put(1,"manisha5"));
        System.out.println(hmap);
        try {
            FileOutputStream fout = new FileOutputStream("hashmap.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(hmap);

            oos.close();
            fout.close();
        }catch(IOException fnf){
            fnf.printStackTrace();
        }
    }
}
