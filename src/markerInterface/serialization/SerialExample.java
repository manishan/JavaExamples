package markerInterface.serialization;

import java.io.*;

public class SerialExample {
    public static void printData(Emp object){
        System.out.println("Employee Name -"+object.name);
        System.out.println("Employee age -"+object.age);
        System.out.println("Employee object a -"+object.a);
        System.out.println("Employee object b -"+object.b);

    }
    public static void main(String args[]){
        Emp empObject = new Emp("Manisha",32,2,4);

        //Serialization of object
        try {
            FileOutputStream file = new FileOutputStream("empObject.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(empObject);
            System.out.println("object before serialization");
            printData(empObject);

            out.close();
            file.close();
        }catch(IOException io){
                System.out.println("Exception catched while serialization");
        }

        empObject =null;
        //deserialization of object from file
        try{
            FileInputStream inputFile = new FileInputStream("empObject.txt");
            ObjectInputStream input = new ObjectInputStream(inputFile);

            empObject= (Emp)input.readObject();
            System.out.println("object after serialization");
            printData(empObject);

            input.close();
            inputFile.close();
        }catch(IOException ie){
            System.out.println("Exception catched while Deserialization");
        }catch(ClassNotFoundException ce){
            System.out.println("Class not found");
        }



    }

}
