package collection.Map;

import java.util.Hashtable;
import java.util.*;

public class HashtableEg {
    public static void main(String args[]){
        Hashtable<Integer,String> h = new Hashtable<Integer, String>();

        Hashtable<Integer,String> htable = new Hashtable<Integer, String>();
        h.put(3,"Geeks");
        h.put(1,"manisha");
        h.put(4,"Manasvi");

        System.out.println("Values in h: "+h);

        htable = (Hashtable<Integer,String>)h.clone(); //hashtable clone method

        System.out.println("Values in clone: "+htable);

        h.clear();//hashtable clear method

        System.out.println("After clearing"+h);

        h.put(10,"Swapnil");
        h.put(11,"Bal");
        // provide value for new key which is absent
        // using computeIfAbsent method
        h.computeIfAbsent(13,k->"manya");
        h.computeIfAbsent(10,k->"Swapnil1");
        System.out.println("After computeifabsent"+h);

        //contains
        System.out.println("Validate contains() "+h.contains("manya"));

        //containsKey
        if(h.containsKey("122")){
            System.out.println("key found in table");
        }else{
            System.out.println("key has not found in hashtable");
        }

        h.put(20,"manya");
        //containsValue
        if(h.containsValue("manya"))
        System.out.println("value found in table");

        //enumeration
        Enumeration e = h.elements();
        System.out.println("Display values with enumeration");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //entryset
        Set s= h.entrySet();
        System.out.println("Set view of hashtable :"+s);

        //equal()
        if(h.equals(htable)){
            System.out.println("both are equal");
        }

        //get()
        System.out.println(h.get(101));

        //hashcode()
        System.out.println(h.hashCode());

        //isEmpty()
        System.out.println("hash isEmpty or not"+h.isEmpty());

        //key()
        Enumeration en =  h.keys();
        System.out.println("Display keys with key()");
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

        //putIfAbsent()
        String retValue = h.putIfAbsent(20,"manya");
        System.out.println("Returned value "
                + "for Key '205' is: "
                + retValue);
        System.out.println(h);

        //keyset()
        Set set = h.keySet();
        System.out.println("Keyset() method result" +set);

        //putall()
        Hashtable<Integer,String> htabl1 = new Hashtable<Integer, String>();
        htabl1.put(33,"Geeks");
        htabl1.put(31,"manisha");
        htabl1.put(35,"Manasvi");
        h.putAll(htabl1);
        System.out.println("putall method result "+h);

        //size()
        System.out.println("size of h hashtable is "+h.size());

        h.remove(33);
        System.out.println("after removing key-33 "+h);

        //toString()
        System.out.println("toString() method result "+h.toString());

        //values()
        System.out.println("Values of hashtable h "+h.values());

    }
}
