/**
 * Takes in a board and returns a solved board
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
