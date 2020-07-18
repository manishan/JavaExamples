package collection;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String args[]){
        ArrayList<String> alist =  new ArrayList<String>();
        //adding data to a list
        alist.add("Manisha");
        alist.add("Asha");
        alist.add("Ishwar");
        alist.add("Annirudha");
        alist.add("Atul");
        System.out.println(alist);
// iteration 1
       /* for(int i=0;i<alist.size();i++){
            System.out.println(alist.get(i));
        }*/

//iteration 2
        /*for(String str:alist)
            System.out.println(str);
*/
        //while loop iteration
        int count =0;
        while(alist.size()> count){
            System.out.println(alist.get(count));
            count++;
        }
//last one is iterator which I have not imeplemented
    }


}
