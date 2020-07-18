package collection.Map;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class HashMapDeserlization {
    public static void main(String args[]){
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();

        try {
            FileInputStream fin = new FileInputStream("hashmap.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            hmap = (HashMap)ois.readObject();

            ois.close();
            fin.close();

            System.out.println(hmap);
        }catch(IOException fnf){
            fnf.printStackTrace();
        }catch(ClassNotFoundException cnf){
            cnf.printStackTrace();
        }
    }
}
