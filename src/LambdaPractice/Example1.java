package LambdaPractice;

public class Example1 {
    public void m1(int a, int b) {
        System.out.println(a + b);
    }

   // (a,b)->System.out.println(a+b);

    public static void main(String args[]) {
        Example1 obj = new Example1();
        obj.m1(1, 2);

    }
}