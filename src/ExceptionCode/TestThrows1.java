package ExceptionCode;

import java.io.IOException;

public class TestThrows1 {
    public void m() throws IOException {
        System.out.println("in m method");
        throw new IOException("IO exception occured");
    }
    public void n() throws  IOException{
        System.out.println("in n method");
        m();
    }
    public void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
        System.out.println("in p method");
    }
    public static void main(String args[]){
        TestThrows1 tt =  new TestThrows1();
        tt.p();
        System.out.println("normal flow");
    }
}
