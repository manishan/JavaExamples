package oops;

public class StaticPolymorphism {
    public static void main(String args[]){
        byte a = 25;
        DemoPoly obj = new DemoPoly();
        obj.show(a); // it will go to
        // byte argument
        obj.show("hello"); // String
        obj.show(250); // Int
        obj.show('A'); // Since  char is
        // not available, so the datatype
        // higher than char in terms of
        // range is int.
        obj.show("A"); // String
       // obj.show(7.5); // since float datatype
    }
}
