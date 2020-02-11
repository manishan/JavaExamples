package ExceptionCode;

public class TestExceptionPropagation1 {
    public void m(){
        int data=30/0;
        System.out.println(data);
    }
    public void n(){
        m();
        System.out.println("n()");
    }
    public void p(){
       try{ n();
       System.out.println("p()");}
       catch(ArithmeticException a){
           System.out.println("Airthmentic error");
       }
    }
    public static void main(String args[]){
        System.out.println("in main method");
        TestExceptionPropagation1 t = new TestExceptionPropagation1();
        t.p();
    }
}
