package markerInterface.serialization;

class Emp implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    transient int a;
    static int b;
    String name;
    int age;
    //default constructor
    public Emp(String name,int age,int a,int b){
        this.name =  name;
        this.age =  age;
        this.a = a;
        this.b=b;
    }

}
