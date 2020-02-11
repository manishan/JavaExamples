package StringCode;

public class Teststringcomparison1 {
    public static void main(String args[]){
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        String s5="";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s5.compareTo(s1));
        System.out.println(s1.compareTo(s4));
    }
}
