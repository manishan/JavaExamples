package collection;
import java.util.ArrayList;
import java.util.Collections;

public class SortingOfArrayList {
    public static void main(String args[]){
        ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");

        /*Unsorted List*/
        System.out.println("Before Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }

        Collections.sort(listofcountries);
        /*sorted List*/
        System.out.println("after Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }

        //sorting in reverse order
        System.out.println("after Sorting reverse order of data");
        Collections.sort(listofcountries,Collections.reverseOrder());
        for(String counter: listofcountries){
            System.out.println(counter);
        }


    }
}
