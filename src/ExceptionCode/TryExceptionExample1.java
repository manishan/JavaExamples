package ExceptionCode;

public class TryExceptionExample1 {
    public static void main(String args[]){
        int i=50;
        int j=0;
        int data;
        try {
             data = i / j;
        }catch(Exception e){
            //System.out.println(e);
            //printCustomMessage
            System.out.println("Divided by zero not allowed");
            data=i/(j+2);
            System.out.println(data);
        }
        /*catch(ArithmeticException e) {
            System.out.println(e);
            //
        }*/
        System.out.println("rest of the code");
    }
}
