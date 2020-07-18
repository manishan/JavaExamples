package collection;
import java.util.Enumeration;
import java.util.Vector;
public class VectorExample {
    public static void main(String args[]){
        Vector<String> v = new Vector<String>();

        v.add("Manisha");
        v.add("manish1");
        v.addElement("manishan2");

        System.out.println("Size is "+v.size());
        System.out.println("Default capacity increament is "+v.capacity());

        v.add("newFruit1");
        v.add("newFruit2");

        System.out.println("After adding two new element Size is "+v.size());
        System.out.println("After adding two new element Default capacity increament is "+v.capacity());

        /*disply vector elements  */

        Enumeration<String> en = v.elements();

        System.out.println("\n elements are: ");
        while(en.hasMoreElements()){
            System.out.println(en.nextElement()+" ");
        }
    }
}
