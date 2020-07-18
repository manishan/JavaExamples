public class StackExample {

    int top =-1;
    int maxSize= 10;
    int stackArray[] = new int[maxSize];
    public boolean push(int val){
        if(top==maxSize){
            System.out.println("stack is overflow");
            return false;
        }else{
            top++;
            stackArray[top]=val;

            return true;
        }
    }
    public boolean pop(){
        if(top==-1){
            System.out.println("stack is underflow");
            return false;
        }else{
            top--;
            return true;
        }
    }

    public void peek(){
        if(top==-1){
            System.out.println("stack is underflow");

        }else{
            for(int i=top;i>=0;i--){
                System.out.println(stackArray[i]);
            }
        }
    }

    public static void main(String argsp[]) {
        StackExample obj = new StackExample();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.pop();
        obj.peek();

    }
}