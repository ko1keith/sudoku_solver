/**
 * Start small, try to solve 4 X 4 sudoku board first
 */
public class Main {
    public static void main(String[] args){

        Board testBoard = new Board();

        Solver solver = new Solver(testBoard);

        solver.solve();



    }
}
