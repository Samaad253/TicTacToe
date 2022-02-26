public class Board {

    private int[][] board;

    public Board() {
        resetBoard();



    }

    @Override
    public String toString() {
        String boardState = "";

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                boardState += board[i][j] + " ";
            }
            boardState += "\n";
        }
        return boardState;
    }

    public void resetBoard(){

       int[][] newBoard = { {-1,-1,-1},
                {-1,-1,-1},
                {-1,-1,-1} };
       board = newBoard;
    }
}
