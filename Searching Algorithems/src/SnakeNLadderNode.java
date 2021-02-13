import java.util.ArrayList;
import java.util.List;

public class SnakeNLadderNode {
    private int value;
    private int timesVisited;
    private boolean isGoal;
    private boolean isSnake;
    private boolean isLadder;
    private boolean isLadderEnding;
    private List<SnakeNLadderNode> neigbors;
    int minimumDepth;

    public SnakeNLadderNode(int value,boolean isGoal){
        this.isGoal = isGoal;
        this.value = value;
        timesVisited = 0;
        neigbors = new ArrayList<>();
        minimumDepth = 40000000;
        isLadder = false;
        isSnake = false;
        isLadderEnding = false;
    }

    public int getValue() {
        return value;
    }

    public int getTimesVisited() {
        return timesVisited;
    }

    public void timesVisitedUp(){
        timesVisited++;
    }

    public boolean isGoal() {
        return isGoal;
    }

    public List<SnakeNLadderNode> getNeigbors() {
        return neigbors;
    }

    public int getMinimumDepth() {
        return minimumDepth;
    }

    public void setMinimumDepth(int minimumDepth) {
        this.minimumDepth = minimumDepth;
    }

    @Override
    public String toString() {
        return "value: "+value+"";
    }

    public void setSnake(boolean snake) {
        isSnake = snake;
    }

    public void setLadder(boolean ladder) {
        isLadder = ladder;
    }

    public boolean isSnake() {
        return isSnake;
    }

    public boolean isLadder() {
        return isLadder;
    }

    public boolean isLadderEnding() {
        return isLadderEnding;
    }

    public void setLadderEnding(boolean ladderEnding) {
        isLadderEnding = ladderEnding;
    }
}
