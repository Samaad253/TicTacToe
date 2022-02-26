public class Board {

    private int[][] board;

    public Board() {
        resetBoard();



    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void resetBoard(){

       int[][] newBoard = { {-1,-1,-1},
                {-1,-1,-1},
                {-1,-1,-1} };
       board = newBoard;
    }
}
