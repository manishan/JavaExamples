package ExceptionCode;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;

class Parent{
    public void msg() throws ArithmeticException{
        System.out.println("in parent class");
    }
}
public class MethodOverrding1 extends Parent{
    public void msg() {
        System.out.println("hi in child class");
    }
    public static void main(String args[]){
        Parent p = new MethodOverrding1();
        p.msg();
    }
}
