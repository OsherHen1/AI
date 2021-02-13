import java.util.ArrayList;

public class mainBFS {
    public static void main(String[] args) {
        SnakeNLadderGame game = new SnakeNLadderGame();
        ArrayList<SnakeNLadderNode> a = game.getBoard();
        SnakeNLadderNode first = game.getBoard().get(0);


        BFS b = new BFS(game.getBoard().get(0));
        double startTimeBFS   = System.nanoTime();
        int scoreBFS = b.findSolution().getMinimumDepth();
        double endTimeBFS   = System.nanoTime();
        double totalTimeBFS = (endTimeBFS - startTimeBFS)* Math.pow(10,-9);
        int sumOfVisitingBFS = 0;

        System.out.println("BFS:");
        for (SnakeNLadderNode slb : game.getBoard()){
            System.out.println("Value: "+slb.getValue()+"  number of visits in this node: "+slb.getTimesVisited()+" Depth: "+slb.getMinimumDepth());
            sumOfVisitingBFS = sumOfVisitingBFS + slb.getTimesVisited();
        }
        System.out.println("total visiting in any node: "+sumOfVisitingBFS);
        System.out.println("number Of Throwing for BFS: "+scoreBFS);
        System.out.println("Runing time BFS [seconds]: "+totalTimeBFS);


    }
}
