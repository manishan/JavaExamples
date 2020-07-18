package collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
public class StackExample {
    public static void main(String args[]){
        //create stack
        Stack<String> stackOfCards = new Stack<String>();
        stackOfCards.push("Manisha");
        stackOfCards.push("Naik");
        stackOfCards.push("Atul");

        System.out.println("Stack=> "+stackOfCards);

        //poping items from stack

        String cardAtTop = stackOfCards.pop();
        System.out.println("top element getting removed "+cardAtTop);
        System.out.println("Current Stack=> "+stackOfCards);

        //Get items from stack without removing
        cardAtTop = stackOfCards.peek();
        System.out.println("top element getting peeked "+cardAtTop);
        System.out.println("Current Stack=> "+stackOfCards);

        //CHeck whether stack is empty or not
        System.out.println(stackOfCards.isEmpty());
        //Check size of stack
        System.out.println(stackOfCards.size());

        //search element in stack
        int position = stackOfCards.search("Mansha");
        if(position != -1) {
            System.out.println("Found the element \"Queen\" at position : " + position);
        } else {
            System.out.println("Element not found");
        }

        //iterating over stack

        stackOfCards.push("Patil");
        stackOfCards.push("Manasvi");
        System.out.println("iterating over a stack using java8 forEach() method");
        stackOfCards.forEach(plate->System.out.println(plate));

        System.out.println("\n=== Iterate over a Stack using iterator() ===");
        Iterator<String> itr = stackOfCards.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\n=== Iterate over a Stack using iterator() and Java 8 forEachRemaining() method ===");
        itr = stackOfCards.iterator();
        itr.forEachRemaining(plate->System.out.println(plate));

        System.out.println("\n=== Iterate over a Stack from TOP to BOTTOM using listIterator() ===");
        // ListIterator allows you to traverse in both forward and backward directions.
        // We'll start from the top of the stack and traverse backwards.
        ListIterator<String> litr = stackOfCards.listIterator(stackOfCards.size());
        while(litr.hasPrevious())System.out.println(litr.previous());
    }
}
