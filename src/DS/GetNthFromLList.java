package DS;

public class GetNthFromLList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next = null;
        }

    }
    void getNth(int index){
        int countOfNode = 0;
        Node currentNode = head;
        while(currentNode!=null){
            if(countOfNode==index) {
                System.out.println("Nth element is " + currentNode.data);
                break;
            }
            else{
                currentNode = currentNode.next;
                countOfNode++;
            }

        }

    }
    public static void main(String args[]){
        GetNthFromLList ll = new GetNthFromLList();
        ll.head = new Node(1);
        Node node2 = new Node(10);
        Node node3 = new Node(30);
        Node node4 = new Node(14);
        int index = 2;

        ll.head.next =  node2;
        node2.next = node3;
        node3.next = node4;

        ll.getNth(index);
    }
}
