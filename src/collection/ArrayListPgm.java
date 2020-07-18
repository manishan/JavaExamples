package collection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPgm {
    public static void main(String args[]){
        ArrayList<String> alist =  new ArrayList<String>();
        //adding data to a list
        alist.add("Manisha");
        alist.add("Asha");
        alist.add("Ishwar");
        alist.add("Annirudha");
        alist.add("Atul");
        System.out.println(alist);

        ArrayList<String> strObj = new ArrayList<String>(
                Arrays.asList("123","2453","3423")
        );
        System.out.println(strObj);

        ArrayList<String> strObj2 = new ArrayList<String>(){{
            add("asdfsf");
            add("asfkjhsk");
        }};

        ArrayList<String> strObj3 = new ArrayList<String>(Collections.nCopies(10,"Manisha"));
        System.out.println(strObj3);

        //Removing data from list
        alist.remove("Asha");
        alist.remove(3);
        System.out.println(alist);

        System.out.println("Size of arrayList " +alist.size());
        //adding new element at mid of list
        alist.add(2,"Ashwini");
        alist.add(4,"Swapnil");
        alist.add(5,"Manasvi");

        //modify existin entry
        alist.set(4,"Swapnil Patil");

        //iterating over list
        for(String str:alist)
            System.out.println(str+" "+str.toUpperCase());

        System.out.println(alist.indexOf("Manisha")+ "\n\n");

 alist.addAll(0,strObj2);
        System.out.println(alist);

        //ArrayList Practic 26/05/2020

        System.out.println("26/05/2020 practice");


    }

}
