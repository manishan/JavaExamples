package DS;

public class FibonacciPgm {
    static int n1=0,n2=1,n3=0;
    static void withoutRecursionGetFibonacci(int number){
        if(number >1) {
         System.out.print(n1+" "+n2 +" ");
         for(int i=2;i<=number;i++){
             n3=n1+n2;
             System.out.print(n3+" ");
             n1=n2;
             n2=n3;
         }
        }else{
            System.out.print(n1+" "+n2 +" ");
        }


    }

    public static void withrecursionGetFibonacci(int count){

        if(count>0){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            withrecursionGetFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        //withoutRecursionGetFibonacci(10);
        int count=10;
        System.out.print(n1+" "+n2+ " ");
        withrecursionGetFibonacci(count-2);
    }
}
