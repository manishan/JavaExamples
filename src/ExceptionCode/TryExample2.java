package ExceptionCode;

public class TryExample2 {
    public static void main(String args[]){
        try{
            int data1=50/0;
        }catch(Exception e){
            System.out.println(e);
            try {
                int data2 = 50 / 0;
            }catch(Exception c){

            }
        }
        System.out.println("rest of code");
    }
}
