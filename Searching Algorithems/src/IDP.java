import java.util.ArrayList;
import java.util.Stack;

public class IDP {
    SnakeNLadderNode firstNode;
    int numOfNodes;
    Stack<SnakeNLadderNode> s;
    ArrayList<SnakeNLadderNode> visited;

    public IDP(SnakeNLadderNode node){
        this.firstNode = node;
        numOfNodes = 0 ;
        s = new Stack<>();
        s.push(firstNode);
        visited = new ArrayList<>();
    }

    public SnakeNLadderNode findSolution() {
        SnakeNLadderNode current;
        SnakeNLadderNode goal = null;
        int currentDepth;
        int maxDepth = 1;
        while (maxDepth<8){
            while (!s.isEmpty()) {
                current = s.pop();
                currentDepth = current.getMinimumDepth();
                current.timesVisitedUp();
                if (current.isGoal()) {
                    goal = current;
                    return goal;
                } else {
                    for (SnakeNLadderNode neigbor : current.getNeigbors()) {
                        if (!current.isSnake()) {
                            if (neigbor.getMinimumDepth() > currentDepth) {
                                if (neigbor.isLadderEnding() && current.isLadder())
                                    neigbor.setMinimumDepth(currentDepth);
                                else
                                    neigbor.setMinimumDepth(currentDepth + 1);
                            }
                            if (neigbor.getMinimumDepth() <= maxDepth && (neigbor.getMinimumDepth()> currentDepth|| (neigbor.isLadderEnding()&& current.isLadder())))
                                s.push(neigbor);
                        }
                    }
            }
        }
        s = new Stack<>();
        maxDepth++;
        s.push(firstNode);
    }
        return goal;
    }
}
