package ExceptionCode;

public class MultipleCatchBlock1 {
    public static void main(String args[]){
        try{
            int a[]= new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }catch(ArithmeticException a){
            System.out.println("Airthmentic excpetion came");
        }catch(NullPointerException n){
            System.out.println("Null pointer exception came");
        }catch(NumberFormatException nf){
            System.out.println("number format exception");
        }catch(Exception e){
            System.out.println("Parent exception came");
        }
        System.out.println("Rest of the code");
    }
}
