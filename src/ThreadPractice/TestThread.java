package ThreadPractice;

public class TestThread extends Thread {

    public void run()
    {
        System.out.println("Thread is running...");
    }
    public static void main(String args[]){
        TestThread r1=new TestThread();
        TestThread r2 = new TestThread();
        //Thread1 th = new Thread1();
        //Thread t1 =new Thread(r1);
        //Thread t2 = new Thread(th);
        // this will call run() method
        r1.start();
        r2.start();
    }
}
