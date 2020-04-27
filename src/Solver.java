/**
 * Takes in a board and returns a solved board. 0 Represents empty cell
 */
public class Solver {

    private int[][] finsihedGrid;
    private int[][] grid;

    private Board boardToSolve;
    private Board solvedBoard;

    public Solver(Board board){
        boardToSolve = board;
    }

    public void solve(){
        grid = boardToSolve.getBoard();

        //print initial board
        printGrid();

        // iterate through each cell in the sudoku board
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid.length; col++){
                // If the current cell is 0, then look for valid option
                if(grid[row][col] == 0){

                }

            }
        }

    }

    // Given the grid, index of current cell, and possible cell num, check if it is valid according
    // the 3 sudoku constraints
    public void checkCell(int[][] grid,  int row, int col, int num){

    }

    public Board getSolvedBoard(){
        return solvedBoard;
    }

    public void printGrid(){
        System.out.println("Inside Solver.printGrid");
        for (int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid.length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
