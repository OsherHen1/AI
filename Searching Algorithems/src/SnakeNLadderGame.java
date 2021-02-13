import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SnakeNLadderGame {
ArrayList<SnakeNLadderNode> board;


public SnakeNLadderGame(){
    this.board = new ArrayList<>();
    board.add(0,new SnakeNLadderNode(0,false));
    board.get(0).setMinimumDepth(0);
    board.add(1,new SnakeNLadderNode(1,false));
    board.add(2,new SnakeNLadderNode(2,false));
    board.add(3,new SnakeNLadderNode(3,false));
    board.add(4,new SnakeNLadderNode(4,false));
    board.add(5,new SnakeNLadderNode(5,false));
    board.add(6,new SnakeNLadderNode(6,false));
    board.add(7,new SnakeNLadderNode(7,false));
    board.add(8,new SnakeNLadderNode(8,false));
    board.add(9,new SnakeNLadderNode(9,false));
    board.add(10,new SnakeNLadderNode(10,false));
    board.add(11,new SnakeNLadderNode(11,false));
    board.add(12,new SnakeNLadderNode(12,false));
    board.add(13,new SnakeNLadderNode(13,false));
    board.add(14,new SnakeNLadderNode(14,false));
    board.add(15,new SnakeNLadderNode(15,false));
    board.add(16,new SnakeNLadderNode(16,false));
    board.add(17,new SnakeNLadderNode(17,false));
    board.add(18,new SnakeNLadderNode(18,false));
    board.add(19,new SnakeNLadderNode(19,false));
    board.add(20,new SnakeNLadderNode(20,false));
    board.add(21,new SnakeNLadderNode(21,false));
    board.add(22,new SnakeNLadderNode(22,false));
    board.add(23,new SnakeNLadderNode(23,false));
    board.add(24,new SnakeNLadderNode(24,false));
    board.add(25,new SnakeNLadderNode(25,false));
    board.add(26,new SnakeNLadderNode(26,false));
    board.add(27,new SnakeNLadderNode(27,false));
    board.add(28,new SnakeNLadderNode(28,false));
    board.add(29,new SnakeNLadderNode(29,false));
    board.add(30,new SnakeNLadderNode(30,false));
    board.add(31,new SnakeNLadderNode(31,false));
    board.add(32,new SnakeNLadderNode(32,false));
    board.add(33,new SnakeNLadderNode(33,false));
    board.add(34,new SnakeNLadderNode(34,false));
    board.add(35,new SnakeNLadderNode(35,false));
    board.add(36,new SnakeNLadderNode(36,false));
    board.add(37,new SnakeNLadderNode(37,false));
    board.add(38,new SnakeNLadderNode(38,false));
    board.add(39,new SnakeNLadderNode(39,false));
    board.add(40,new SnakeNLadderNode(40,false));
    board.add(41,new SnakeNLadderNode(41,false));
    board.add(42,new SnakeNLadderNode(42,false));
    board.add(43,new SnakeNLadderNode(43,false));
    board.add(44,new SnakeNLadderNode(44,false));
    board.add(45,new SnakeNLadderNode(45,false));
    board.add(46,new SnakeNLadderNode(46,false));
    board.add(47,new SnakeNLadderNode(47,false));
    board.add(48,new SnakeNLadderNode(48,false));
    board.add(49,new SnakeNLadderNode(49,false));
    board.add(50,new SnakeNLadderNode(50,false));
    board.add(51,new SnakeNLadderNode(51,false));
    board.add(52,new SnakeNLadderNode(52,false));
    board.add(53,new SnakeNLadderNode(53,false));
    board.add(54,new SnakeNLadderNode(54,false));
    board.add(55,new SnakeNLadderNode(55,false));
    board.add(56,new SnakeNLadderNode(56,false));
    board.add(57,new SnakeNLadderNode(57,false));
    board.add(58,new SnakeNLadderNode(58,false));
    board.add(59,new SnakeNLadderNode(59,false));
    board.add(60,new SnakeNLadderNode(60,false));
    board.add(61,new SnakeNLadderNode(61,false));
    board.add(62,new SnakeNLadderNode(62,false));
    board.add(63,new SnakeNLadderNode(63,false));
    board.add(64,new SnakeNLadderNode(64,false));
    board.add(65,new SnakeNLadderNode(65,false));
    board.add(66,new SnakeNLadderNode(66,false));
    board.add(67,new SnakeNLadderNode(67,false));
    board.add(68,new SnakeNLadderNode(68,false));
    board.add(69,new SnakeNLadderNode(69,false));
    board.add(70,new SnakeNLadderNode(70,false));
    board.add(71,new SnakeNLadderNode(71,false));
    board.add(72,new SnakeNLadderNode(72,false));
    board.add(73,new SnakeNLadderNode(73,false));
    board.add(74,new SnakeNLadderNode(74,false));
    board.add(75,new SnakeNLadderNode(75,false));
    board.add(76,new SnakeNLadderNode(76,false));
    board.add(77,new SnakeNLadderNode(77,false));
    board.add(78,new SnakeNLadderNode(78,false));
    board.add(79,new SnakeNLadderNode(79,false));
    board.add(80,new SnakeNLadderNode(80,false));
    board.add(81,new SnakeNLadderNode(81,false));
    board.add(82,new SnakeNLadderNode(82,false));
    board.add(83,new SnakeNLadderNode(83,false));
    board.add(84,new SnakeNLadderNode(84,false));
    board.add(85,new SnakeNLadderNode(85,false));
    board.add(86,new SnakeNLadderNode(86,false));
    board.add(87,new SnakeNLadderNode(87,false));
    board.add(88,new SnakeNLadderNode(88,false));
    board.add(89,new SnakeNLadderNode(89,false));
    board.add(90,new SnakeNLadderNode(90,false));
    board.add(91,new SnakeNLadderNode(91,false));
    board.add(92,new SnakeNLadderNode(92,false));
    board.add(93,new SnakeNLadderNode(93,false));
    board.add(94,new SnakeNLadderNode(94,false));
    board.add(95,new SnakeNLadderNode(95,false));
    board.add(96,new SnakeNLadderNode(96,false));
    board.add(97,new SnakeNLadderNode(97,false));
    board.add(98,new SnakeNLadderNode(98,false));
    board.add(99,new SnakeNLadderNode(99,false));
    board.add(100,new SnakeNLadderNode(100,true));

    HashMap<Integer,Integer> ladders = new HashMap<>(); // Ladder -> leads to
    ladders.put(1,38);
    ladders.put(4,14);
    ladders.put(9,31);
    ladders.put(28,84);
    ladders.put(21,42);
    ladders.put(51,67);
    ladders.put(72,91);
    ladders.put(80,99);

    getBoard().get(1).setLadder(true);
    getBoard().get(4).setLadder(true);
    getBoard().get(9).setLadder(true);
    getBoard().get(28).setLadder(true);
    getBoard().get(21).setLadder(true);
    getBoard().get(51).setLadder(true);
    getBoard().get(72).setLadder(true);
    getBoard().get(80).setLadder(true);

    HashMap<Integer,Integer> snakes = new HashMap<>(); // snakes
    snakes.put(17,7);
    snakes.put(62,19);
    snakes.put(98,79);
    snakes.put(64,60);
    snakes.put(95,75);
    snakes.put(87,36);
    snakes.put(93,73);
    snakes.put(54,34);

    getBoard().get(17).setSnake(true);
    getBoard().get(62).setSnake(true);
    getBoard().get(98).setSnake(true);
    getBoard().get(64).setSnake(true);
    getBoard().get(95).setSnake(true);
    getBoard().get(87).setSnake(true);
    getBoard().get(93).setSnake(true);
    getBoard().get(54).setSnake(true);

    getBoard().get(99).setLadderEnding(true);
    getBoard().get(91).setLadderEnding(true);
    getBoard().get(84).setLadderEnding(true);
    getBoard().get(67).setLadderEnding(true);
    getBoard().get(42).setLadderEnding(true);
    getBoard().get(38).setLadderEnding(true);
    getBoard().get(14).setLadderEnding(true);
    getBoard().get(31).setLadderEnding(true);


    for (SnakeNLadderNode slb : board){
        for (int i = 1; i < 7; i++) {
            if (slb.getValue()+i <= 100){
                if (ladders.containsKey(slb.getValue())) { // current state + cube is ladder
                    if(slb.getNeigbors().size()==0)
                        slb.getNeigbors().add(board.get(ladders.get(slb.getValue())));
                }
                else{
                    if (snakes.containsKey(slb.getValue())){
                        if(slb.getNeigbors().size()==0)
                            slb.getNeigbors().add(board.get(snakes.get(slb.getValue())));
                        //}
                    }
                    else {
                        slb.getNeigbors().add(board.get(slb.getValue() + i));
                    }
                }
            }
        }
    }

    System.out.println("Im Done");



}

    public ArrayList<SnakeNLadderNode> getBoard() {
        return board;
    }
}
