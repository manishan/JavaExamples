package GarbageCollection;

public class Test1 {
    private String message;
    public Test1(String msg){
        this.message = msg;
    }

    static void show(){
        Test1 t1 = new Test1("test1");
        display();
    }

    static void display(){
        Test1 t2 = new Test1("test2");
    }
    static public void main(String args[]){
        show();
     new Test1("testknkl");
       // System.gc();
    }
    /*protected void finalize() throws Throwable{
        System.out.println(this.message + " object get garbage collected");
    }*/
}
