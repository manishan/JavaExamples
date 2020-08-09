package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
    int id;
    String name;
    public TestSet(int id,String name){
        this.id=id;
        this.name=name;
    }
    public static void main(String args[]){
        HashSet<String> s =  new HashSet<String>();
        s.add("spring");
        s.add("spring");
        System.out.println(s);
        System.out.println("s hashcode is "+s.hashCode());
        TestSet ts1= new TestSet(1,"manisha");
        TestSet ts2= new TestSet(1,"manisha");
        ArrayList<TestSet> stdList =  new ArrayList<TestSet>();
        HashSet<TestSet> s1= new HashSet<TestSet>();

        stdList.add(ts1);
        stdList.add(ts2);
        s1.add(ts1);
        s1.add(ts2);
        System.out.println(s1);
        Iterator itr = s1.iterator();
        while(itr.hasNext()) System.out.println(itr.next());
       // s1.addAll(stdList);



        /*
HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1,"manisha");
        hm.put(2,"manisha2");
        hm.put(3,"manisha3");
        hm.put(4,"manisha4");
        System.out.println(hm);
        System.out.println(hm.put(4,"mASJH"));
        System.out.println(hm.remove(2));
*/

    }

//    public String toString(){
//     return this.name+" "+this.id;
//    }

}

