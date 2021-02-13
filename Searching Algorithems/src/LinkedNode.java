/**
 * This class is made for Queue implementation for Leather and snakes - LNS - QueueLNS
 */


public class LinkedNode {

    private LinkedNode next;
    private SnakeNLadderNode data;

    public LinkedNode getNext() {
        return next;
    }

    public SnakeNLadderNode getData() {
        return data;
    }

    public LinkedNode(SnakeNLadderNode data){
        this.data = data;
        next = null;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    public void setData(SnakeNLadderNode data) {
        this.data = data;
    }

    public void printList(){
        LinkedNode pointer = this;
        while (pointer !=null) {
            System.out.print(pointer.data.toString()+" ");
            pointer = pointer.next;
        }

    }
}
