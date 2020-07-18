package StringCode;

public class Swap2Numbers {
    public static void main(String args[]){
        int num1=4,num2=8;
        System.out.println("Before swap two numbers are :"+num1 +" "+num2);
        num1= num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After swap two numbers are :"+num1 +" "+num2);
    }
}
