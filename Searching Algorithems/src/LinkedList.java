/**
 * This class is made for Queue implementation for Leather and snakes - LNS - QueueLNS
 */

public class LinkedList {
    private LinkedNode head;
    private LinkedNode tail;
    private int size;

    public LinkedList(){
        size =0;

    }
    public LinkedList(LinkedNode head1){
        this.head = head1;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void insertLast (SnakeNLadderNode data){
        LinkedNode newLast = new LinkedNode(data);
        if (isEmpty()){
            this.head = newLast;
            this.tail = newLast;
            size++;
            return;
        }
        tail.setNext(newLast);
        tail = newLast;
    }

    public void insertFirst (SnakeNLadderNode data){
        LinkedNode newFirst = new LinkedNode(data);
        if (isEmpty()){
            head = newFirst;
            tail = newFirst;
            size++;
        }
        else {
            newFirst.setNext(this.head);
            this.head = newFirst;
            size++;
        }
    }

    public Object removeFirst() {
        LinkedNode pointer = head;
        if (!isEmpty()) {
            if (head.getNext() == null) {
                head = null;
                tail = null;
                size--;
                return pointer;
            }
            head = pointer.getNext();
            pointer.setNext(null);
            size--;
            return pointer;
        }
        else{
            return null;
        }
    }



    public LinkedNode removeLast(){
        LinkedNode pointer = head;
        if (!isEmpty()) {
            if (head.getNext()==null){
                head = null;
                tail = null;
                size--;
                return pointer;
            }
            while (!pointer.getNext().equals(tail))
                pointer = pointer.getNext();
            LinkedNode returnPointer = tail;
            tail = pointer;
            tail.setNext(null);
            size--;
            return returnPointer;
        } else{
            return null;
        }
    }

    public void printList (){
        LinkedNode pointer = this.head;
        while (pointer!= null){
            System.out.println(pointer.getData());
            pointer = pointer .getNext();
        }
    }

    public LinkedNode getHead() {
        return head;
    }
}
