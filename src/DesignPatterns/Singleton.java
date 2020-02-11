package DesignPatterns;

public class Singleton {
    private  static Singleton obj = new Singleton();
    private Singleton(){}

    public static Singleton getSingleton(){
        /*if(obj == null){
            synchronized (Singleton.class){
                if(obj==null){
                    obj= new Singleton();
                }
            }
        }*/
        return obj;
    }
    public void showMe(){

    }

}
