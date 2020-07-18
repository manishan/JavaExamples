package markerInterface.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoForTest {
    public static void main(String args[]) throws Exception{
        Test obj = new Test();

        //creating class object from the object using getclass method
        Class cls = obj.getClass();
        System.out.println("The name of class is "+cls.getName());

        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is "+ constructor.getName());
        System.out.println("the public methods of class are : ");

        Method[] methods = cls.getMethods();
        for(Method method:methods)
            System.out.println(method.getName());

        Method methodCall2 = cls.getDeclaredMethod("method2",int.class);
        methodCall2.invoke(obj,19);

        Field field = cls.getDeclaredField("s");

        field.setAccessible(true);

        field.set(obj,"JAVA");

        Method methodCall1 = cls.getDeclaredMethod("method1");
        methodCall1.invoke(obj);

        Method methodCall3 = cls.getDeclaredMethod("method3");
        methodCall3.setAccessible(true);
        methodCall3.invoke(obj);




    }
}
