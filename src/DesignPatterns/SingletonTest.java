package DesignPatterns;

public class SingletonTest {
    //private  static Singleton obj = new Singleton();
    private  static SingletonTest obj = null;
    private SingletonTest(){}

    public static SingletonTest getSingleton(){
        if(obj == null){
            synchronized (SingletonTest.class){
                if(obj==null){
                    obj= new SingletonTest();
                }
            }
        }
        return obj;
    }
    public void showMe(){

    }

}
