import java.util.ArrayList;

public class mainIDP {
    public static void main(String[] args) {
        SnakeNLadderGame game = new SnakeNLadderGame();
        ArrayList<SnakeNLadderNode> a = game.getBoard();
        SnakeNLadderNode first = game.getBoard().get(0);

        IDP idp = new IDP(game.getBoard().get(0));
        double startTimeIDP   = System.nanoTime();
        int scoreIDP = idp.findSolution().getMinimumDepth();
        double endTimeIDP   = System.nanoTime();
        double totalTimeIDP = (endTimeIDP - startTimeIDP)* Math.pow(10,-9);
        int sumOfVisitingIDP = 0;

        System.out.println("IDP:");
        for (SnakeNLadderNode slb : game.getBoard()){
            System.out.println("Value: "+slb.getValue()+"  number of visits in this node: "+slb.getTimesVisited()+" Depth: "+slb.getMinimumDepth());
            sumOfVisitingIDP = sumOfVisitingIDP + slb.getTimesVisited();
        }
        System.out.println("total visiting in any node: "+sumOfVisitingIDP);
        System.out.println("number Of Throwing for IDP: "+scoreIDP);
        System.out.println("Runing time IDP [seconds]: "+totalTimeIDP);


    }
}
