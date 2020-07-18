package Ciena;

public class MaxElementWithIndex {
    public void findIndexForMaxInt(int [] arrayOfNumbers){
        int maxElement = arrayOfNumbers[0];
        int maxElementLocation = -1;
        for(int i=1;i<arrayOfNumbers.length;i++){
            //for(int j= i;j>0;j--)
            if(arrayOfNumbers[i]>maxElement){
                maxElement = arrayOfNumbers[i];
                maxElementLocation = i;
            }
        }
        System.out.println("Maximum integer of given array is "+maxElement+" and index of max element is "+maxElementLocation);
    }
    public void findIndexForGivenNumber(int[] arrayOfNumbers,int elementToFind){
        int elementIndex = -1;
        //code to find array index for given integer
        for(int i=0;i<arrayOfNumbers.length;i++){
            if(arrayOfNumbers[i]==elementToFind){
                elementIndex = i;
            }else{
                continue;
            }

            if(elementIndex!=-1){
                System.out.println("index of "+elementToFind+" element in array is :"+elementIndex);
            }
        }
    }

    public static void main(String args[]){
        final long startTime = System.nanoTime();
        int[] givenArray = {1,2,3,4,2,3,1};
        int findIndexFor = 3;
        MaxElementWithIndex obj = new MaxElementWithIndex();
        obj.findIndexForMaxInt(givenArray);
        obj.findIndexForGivenNumber(givenArray,findIndexFor);
        final long duration = System.nanoTime() - startTime;
        System.out.println(duration);
    }
}
