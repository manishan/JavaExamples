package ExceptionCode;

public class TryCatchExample3 {
    public static void main(String args[]){
        try{
            int data=25/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
