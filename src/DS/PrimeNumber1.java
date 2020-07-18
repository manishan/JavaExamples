package DS;

import java.util.Scanner;

public class PrimeNumber1 {
    public boolean checkPrime(int inputInt){
        boolean flag =true;
        int lengthForLoop = inputInt/2;
        if(inputInt <=1){
            System.out.println("Given number is not prime");
        }else{
            for(int i=2;i<=lengthForLoop;i++){
                if(inputInt%i ==0){
                    flag=false;
                    System.out.println("given number is not prime");
                    break;
                }
            }
        }


        return flag;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number -");
        int n = scanner.nextInt();
        PrimeNumber1 obj = new PrimeNumber1();
        if(obj.checkPrime(n)){
            System.out.println(n +" the is prime number");
        }else{
            System.out.println(n +" the is not prime number");
        }
    }
}
