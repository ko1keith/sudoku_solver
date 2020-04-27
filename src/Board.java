import java.util.Arrays;

public class Board {

    // instance variables
    private int[][] board;

    //Contructor
    public Board(){
        this.board = createNewBoard();
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

    public void printBoard(){
        for (int row = 0; row < this.board.length; row++){
            for(int col = 0; col < this.board.length; col++){
                System.out.print(this.board[row][col] + "\t");
            }
            System.out.println();
        }
    }

}
