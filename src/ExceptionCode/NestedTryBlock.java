package ExceptionCode;

public class NestedTryBlock {
    public static void main(String args[]){
        try{
            try{
                System.out.println("in first try block");
                int b =39/0;

            }catch(ArithmeticException e){
                System.out.println("in first catch block "+e);
            }

            try{
                int a[]=new int [5];
                a[10]=35;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("second catch "+e);
            }
        }catch(Exception e){
            System.out.println("All exception handled "+e);
        }
        System.out.println("normal flow");
    }
}
