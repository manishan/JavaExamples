package GarbageCollection;

public class Test2 {
    Test2 i;
    public static void main(String args[]){
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();

        t1.i = t2;
        t2.i= t1;
        t1=null;
        t2=null;
  System.gc();
    }
    protected void finalize() throws Throwable{
        System.out.println("finalize method called");
    }
}
