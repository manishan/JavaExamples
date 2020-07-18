package markerInterface.serialization;

import java.io.*;

public class Test {
    public static void main(String args[]){
        A obj =  new A(1,"geekForGeeks");
        String fileName = "file.ser";
        //serialization
        try{
            //saving object in file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //method for serlization object
            out.writeObject(obj);

            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }catch(IOException ex){
            System.out.println("exception ");
        }

        A object1 =null;
        //Deserialization
        try{
            //reading file and object from file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            //read object from file
            object1= (A)in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }catch (IOException ex){

        }catch(ClassNotFoundException cn){

        }
    }
}
