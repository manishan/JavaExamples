package markerInterface.reflection;

public class TestClass1 {
    public static void main(String args[]) throws Exception{
        Class c1 = Class.forName("Sample");

        Class c2 = boolean.class;
        System.out.println(c2.getName());
    }
}
