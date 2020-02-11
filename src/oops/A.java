package oops;

public class A {
    String myName = "Manisha";
    void getName(){
        System.out.println("in class A");
    }
    static void getFullName(){
        System.out.println("full name in class A");
    }

    final void getFullNameFinal(){
        System.out.println("in class A final method");
    }

    public static void main(String args[]){
        A a = new B();
        a.getName();
        a.getFullNameFinal();
        a.getFullName();
    }
}

class B extends  A{
    void getName(){
        System.out.println("in class B");
    }
    static void getFullName(){
        System.out.println("full name in class B");
    }


}
