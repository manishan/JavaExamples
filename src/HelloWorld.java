public class HelloWorld {
    public static void main(String args[]){
        System.out.println("hi this is manisha");
        HelloWorld obj = new HelloWorld();
        //obj.get2DMatrix();
        final HelloWorld h = new HelloWorld();
        //h.A(0,0);
    }

    /*public void get2DMatrix(){
        int [][] arr= new int[3][2];
        int a=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]= a++;
                System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
            }
        }
    }*/
 void A(double d,int i){ System.out.println("in A1");}
 void A(int i,double d){ System.out.println("in A2");}
 void A(String s1,String s2){ System.out.println("in A3");}
}
