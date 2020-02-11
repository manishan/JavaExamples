package ExceptionCode;

public class ExceptionQuiz {
    public static void throwIt(){
        System.out.println("throwIt");
        throw new RuntimeException();
    }
    public static void main(String args[]){
        try{
            System.out.println("hello");
            throwIt();
        }catch(Exception e){
            e.getMessage();
            System.out.println("caught");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("after");
    }
}
