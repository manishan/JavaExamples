package StringCode;

public class StringPelindrome {
    public static void main(String args[]){
        String givenString = "test for string";
        char arry[] = givenString.toCharArray();

        System.out.println("before reverse string-- "+ givenString);
        String reverseStr="";
        for(int a=givenString.length()-1 ;a>=0;a--){
            reverseStr = reverseStr+ givenString.charAt(a);
        }
        System.out.println("reversed string --"+reverseStr);
    }
}
