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
        grid = boardToSolve.getBoard();

    }

    public boolean solve(int[][] grid){

        //print initial board
        printGrid();

        // iterate through each cell in the sudoku board
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid.length; col++){
                // If the current cell is 0, then look for valid option
                if(grid[row][col] == 0){
                    for( int num = 1; num <= 4; num++){ // check 1 through 4
                        if(checkCell(grid, row, col, num)){ // if current board is valid (no rules broken)
                            grid[row][col] = num; //try current num

                            if(solve(grid)){
                                return true;
                            }else{
                                grid[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }

    // Given the grid, index of current cell, and possible cell num, check if it is valid according
    // the 3 sudoku constraints
    public boolean checkCell(int[][] grid,  int row, int col, int num){
        for(int i = 0; i < 4; i++){
            if (grid[i][col] != 0 && grid[i][col] == num) { //check if num is already in row
                return false;
            }else if(grid[row][i] !=0 && grid[row][i] == num){ //check if num is already in col
                return false;
            }else if(grid[2 * (row/2) + i/2][2 * (col/2) + i%2] != 0 && rid[2 * (row/2) + i/2][2 * (col/2) + i%2] == num){
                return false;
            }
        }
        return true;
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
