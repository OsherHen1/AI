import java.util.ArrayList;
import java.util.Queue;

public class BFS {
    SnakeNLadderNode firstNode;
    int numOfNodes;
    QueueLNS q;
    ArrayList<SnakeNLadderNode> visited;

    public BFS(SnakeNLadderNode node){
        this.firstNode = node;
        numOfNodes = 0 ;
        q = new QueueLNS();
        q.enqueue(firstNode);
        visited = new ArrayList<>();
    }

    public SnakeNLadderNode findSolution(){
        SnakeNLadderNode current;
        SnakeNLadderNode goal = null;
        int currentDepth = 0 ;
        while (!q.isEmpty()){
            current = q.dequeue();
            currentDepth = current.getMinimumDepth();
            current.timesVisitedUp();
            if (current.isGoal()) { // checking goal state before push to stack as learned in class
                //System.out.println("here");
                goal =  current;
                return goal;
            }
            else{
                for (SnakeNLadderNode neigbor : current.getNeigbors()) {
                if (!current.isSnake()) {
                    if (neigbor.getMinimumDepth() > currentDepth) {
                        if (neigbor.isLadderEnding() && current.isLadder())
                            neigbor.setMinimumDepth(currentDepth);
                        else
                            neigbor.setMinimumDepth(currentDepth + 1);
                    }
                    if (neigbor.getMinimumDepth()> currentDepth || (neigbor.isLadderEnding()&& current.isLadder())) // to delete
                        q.enqueue(neigbor);
                    }
                }
               }
            }
        return goal;
    }
}
