import java.util.Arrays;

/**
 * Represents a Sudolu board
 */
public class Board {

    // instance variables
    private int[][] board;

    //Contructor
    public Board(){
        board = createNewBoard();
    }


    // class methods
    public int[][] createNewBoard(){

        int[][] tempBoard = new int[][]{
                {0,0,4,0},
                {4,0,3,2},
                {0,0,1,0},
                {1,4,0,0}
        };

        return tempBoard;

    }



    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board){
        this.board = board;
    }
}
