/**
 * Start small, try to solve 4 X 4 sudoku board first
 */
public class Main {
    public static void main(String[] args){

        Board testBoard = new Board();

        Solver solver = new Solver(testBoard);

        int[][] grid = testBoard.getBoard();

        System.out.println("Unsolved board.");
        solver.printGrid();

        solver.solve(grid);

        System.out.println("Solved board.");
        solver.printGrid();



    }
}
