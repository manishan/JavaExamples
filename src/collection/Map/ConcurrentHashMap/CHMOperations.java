package collection.Map.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class CHMOperations {
    public static void main(String args[]){
        ConcurrentHashMap m = new ConcurrentHashMap();

        m.put(101,"Durga");
        //m.put(101,"Ravi");

        //add operation
        System.out.println("Add operation");
        System.out.println(m);
        m.putIfAbsent(101,"Shiva"); //ConcurrentHashmap additional method
        System.out.println(m);

        //remove operation
        System.out.println("Remove operation");
        m.remove(101,"Ravi");
        System.out.println(m);
        m.remove(101,"Durga");
        System.out.println(m);

        //replace operation
        System.out.println("Replace operation");

        m.put(101,"Durga");
        m.replace(101,"Ravi","Siva");
        System.out.println(m);
        m.replace(101,"Durga","Ravi");
        System.out.println(m);

    }
}
