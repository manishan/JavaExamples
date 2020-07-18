package collection.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class JavaObjectSorting {
    public static void main(String args[]){
        int[] intArr =  {5,9,37,12};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //sorting string array
        String[] strArray = {"Z","R","U","A"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        //sort list
        ArrayList<String> list1 =  new ArrayList<String>();
        list1.add("Manisha");
        list1.add("Naik");
        list1.add("Amar");
        Collections.sort(list1);
        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }

    }
}
