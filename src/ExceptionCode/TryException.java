package ExceptionCode;

public class TryException {
 public static void main(String args[]){
     try{
         int data=100/0;
     }catch(ArithmeticException e){
         System.out.println(e);
         System.out.println("rest of the code");
     }

     try{
         String s =null;
         s.length();
     } catch(NullPointerException n){
         System.out.println(n);

     }

     try {
         String m="abc";
         int a= Integer.parseInt(m);
     }
     catch(NumberFormatException f){
         System.out.println(f);
     }

     try {
         int[] a= new int[5];
         a[10]=50;
     }catch(ArrayIndexOutOfBoundsException s){
         System.out.println(s);
     }

     System.out.println("Rest of the code");
 }
}
