public class QueueLNS {
    private LinkedList list;
    private boolean isEmpty;
    private int size;

    public QueueLNS(){
        list = new LinkedList();
        isEmpty = true;
        size = 0;
    }

    public void enqueue(SnakeNLadderNode data){
        list.insertFirst(data);
        this.size++;
    }

    public SnakeNLadderNode dequeue(){
        if (!isEmpty()) {
            size--;
            return (list.removeLast()).getData();
        }
        else{
            System.out.println("The queue is Empty");
            return null;
        }
    }

    public boolean isEmpty(){
        return (size==0);
    }
}
