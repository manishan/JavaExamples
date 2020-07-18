package DS;

import java.lang.reflect.Array;

public class PalindromePgm {
    //get the number to check for palindrome
    //hold the number in temporary variable
    //reverse the number
    //compare the temporary number with reversed number
    //if both numbers are same, print "palindrome number"
    //else print "not palindrome number"
    public String getItReverse(String n){

        String str = n;
        int len = str.length();
        System.out.println(len);
        String reverse ="";
        for(int i=len-1;i>=0; i--){
            reverse = reverse + str.charAt(i);
            //System.out.println(reverse);
        }
        System.out.println(reverse);
        if(!reverse.isEmpty()){
            System.out.println(Integer.getInteger(reverse));
        }

        return reverse;

    }
    public static void main(String args[]){
        /*String n= "12321";
        String temp = n;
        PalindromePgm obj = new PalindromePgm();
        System.out.println("Given number");
        if(n.equalsIgnoreCase(obj.getItReverse(n))){
            System.out.println("String is pelindrome");
        }else{
            System.out.println("String is not pelindrome");
        }*/
        int r,sum=0,temp;
        int n=454;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            System.out.println("n -"+n);
            r=n%10;  //getting remainder
            System.out.println("r -"+r);
            sum=(sum*10)+r;
            System.out.println("sum -"+sum);
            n=n/10;
            System.out.println("n -"+n);
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

}

