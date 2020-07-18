package GarbageCollection;

public class Test {
    public static void main(String args[]){
        Test test1 = new Test();
        Test test2 =  new Test();

        //nullyfying refernce variable
        test1 = null;

        //requesting jvm for running GC
        System.gc();

        //nullifying refernece variable;
        test2=null;

        Runtime.getRuntime().gc();

    }

    protected void finalize() throws Throwable{
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected :" + this);
    }
}
