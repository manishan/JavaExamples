package Ciena;

public class SmallestNumber {
    public void sortArray(int[] arrayForSrt){
        int temp;
        for(int i=1;i<arrayForSrt.length;i++){
            for(int j=i;j>0;j--) {
                if (arrayForSrt[j] < arrayForSrt[j - 1]) {
                    temp = arrayForSrt[j];
                    arrayForSrt[j] = arrayForSrt[j  -1];
                    arrayForSrt[j - 1] = temp;
                }
            }
        }
        System.out.print("sorted array is :{");
        for(int i :arrayForSrt){
            System.out.print(i+" ");
        }
        System.out.print("}\n");

    }
    public void findSmallestNumber(int[] ipArray){
        int len = ipArray.length;
        int missingNumbers =0;
        int firstNumber = ipArray[0];
        for(int i=1;i<ipArray.length;i++){
            int nextNumber = firstNumber+i;
            if(ipArray[i] == nextNumber ){
                continue;
            }else{
                if(nextNumber !=0) {
                    missingNumbers = nextNumber;
                }
            }
        }

        if(missingNumbers >0) {
            System.out.println("Smallest missing number is " + missingNumbers);
        }else{
            System.out.println("No missing element for array");
        }

    }
    public static void main(String args[]){
        final long startTime = System.nanoTime();

        int[] inputArray = {-1,1,2,3,10,7};

        SmallestNumber obj = new SmallestNumber();
        //obj.sortArray(inputArray);
        obj.findSmallestNumber(inputArray);
        final long duration = System.nanoTime() - startTime;
        System.out.println(duration);

    }
}
