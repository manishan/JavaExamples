package oops;

class B{
        public void m1(){System.out.println("hi1 B");}
}
public class A extends B{
        public void m1(){ System.out.println("m1 hi1");}
        public void m2(){System.out.println("m2 hi1");}
        public static void main(String args[]){
        B b = new A();


        }
}

